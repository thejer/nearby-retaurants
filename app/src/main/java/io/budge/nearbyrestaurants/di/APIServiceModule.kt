package io.budge.nearbyrestaurants.di

import com.google.gson.Gson
import dagger.Lazy
import dagger.Module
import dagger.Provides
import io.budge.nearbyrestaurants.BuildConfig
import io.budge.nearbyrestaurants.data.api.RestaurantsApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module(includes = [AppModule::class])
class APIServiceModule {

    @Provides
    @Named("RestaurantsApiService")
    @Singleton
    fun provideRestaurantsServiceHttpClient(
            upstream: OkHttpClient,
    ): OkHttpClient {
        return upstream.newBuilder()
                .build()
    }


    @Provides
    @Singleton
    fun provideRestaurantsAPIService(
            @Named("RestaurantsApiService") client: Lazy<OkHttpClient>,
            gson: Gson
    ): RestaurantsApiService {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client.get())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(RestaurantsApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideGenericOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient =
            OkHttpClient.Builder()
                    .addInterceptor {
                        val request = it.request()
                        val url = request.url.newBuilder()
                                .addQueryParameter("location", LOCATION_PARAM)
                                .addQueryParameter("radius", RADIUS_PARAM)
                                .addQueryParameter("type", TYPE_PARAM)
                                .addQueryParameter("key", AUTH_KEY)
                                .build()
                        return@addInterceptor it.proceed(
                                request
                                        .newBuilder()
                                        .url(url)
                                        .build()
                        )
                    }.addInterceptor(interceptor)
                    .build()

    @Provides
    @Singleton
    fun provideLoggingInterceptor(): HttpLoggingInterceptor =
            HttpLoggingInterceptor().apply {
                level = if (BuildConfig.DEBUG) {
                    HttpLoggingInterceptor.Level.BODY
                } else {
                    HttpLoggingInterceptor.Level.NONE
                }
            }

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()

    @Provides
    @Singleton
    fun provideGsonConverterFactory(gson: Gson): GsonConverterFactory =
            GsonConverterFactory.create(gson)


    companion object {
        const val AUTH_KEY = "AIzaSyD0AQBJ_BwInY5Tv_0tqGPJIWL7FcllnH0"
        const val LOCATION_PARAM = "47.6204,-122.3491"
        const val RADIUS_PARAM = "2500"
        const val TYPE_PARAM = "restaurant"
        const val BASE_URL = "https://maps.googleapis.com/"
    }
}
