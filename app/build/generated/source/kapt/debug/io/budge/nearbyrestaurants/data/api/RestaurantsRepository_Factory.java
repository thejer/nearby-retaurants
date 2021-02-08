package io.budge.nearbyrestaurants.data.api;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RestaurantsRepository_Factory implements Factory<RestaurantsRepository> {
  private final Provider<RestaurantsApiService> apiServiceProvider;

  public RestaurantsRepository_Factory(Provider<RestaurantsApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RestaurantsRepository get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RestaurantsRepository_Factory create(
      Provider<RestaurantsApiService> apiServiceProvider) {
    return new RestaurantsRepository_Factory(apiServiceProvider);
  }

  public static RestaurantsRepository newInstance(RestaurantsApiService apiService) {
    return new RestaurantsRepository(apiService);
  }
}
