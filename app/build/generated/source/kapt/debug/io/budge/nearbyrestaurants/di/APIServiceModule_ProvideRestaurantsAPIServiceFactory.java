package io.budge.nearbyrestaurants.di;

import com.google.gson.Gson;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

import io.budge.nearbyrestaurants.data.api.RestaurantsApiService;
import okhttp3.OkHttpClient;
import org.budge.nearbyrestaurants.data.api.RestaurantsApiService;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIServiceModule_ProvideRestaurantsAPIServiceFactory implements Factory<RestaurantsApiService> {
  private final APIServiceModule module;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<Gson> gsonProvider;

  public APIServiceModule_ProvideRestaurantsAPIServiceFactory(APIServiceModule module,
      Provider<OkHttpClient> clientProvider, Provider<Gson> gsonProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public RestaurantsApiService get() {
    return provideRestaurantsAPIService(module, DoubleCheck.lazy(clientProvider), gsonProvider.get());
  }

  public static APIServiceModule_ProvideRestaurantsAPIServiceFactory create(APIServiceModule module,
      Provider<OkHttpClient> clientProvider, Provider<Gson> gsonProvider) {
    return new APIServiceModule_ProvideRestaurantsAPIServiceFactory(module, clientProvider, gsonProvider);
  }

  public static RestaurantsApiService provideRestaurantsAPIService(APIServiceModule instance,
      Lazy<OkHttpClient> client, Gson gson) {
    return Preconditions.checkNotNull(instance.provideRestaurantsAPIService(client, gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
