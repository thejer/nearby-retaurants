package org.codejudge.android.di

import dagger.Module
import dagger.Provides
import org.codejudge.android.data.api.IRestaurantsRepository
import org.codejudge.android.data.api.RestaurantsApiService
import org.codejudge.android.data.api.RestaurantsRepository
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideRestaurantRepository(restaurantsApiService: RestaurantsApiService): IRestaurantsRepository {
        return RestaurantsRepository(restaurantsApiService)
    }
}