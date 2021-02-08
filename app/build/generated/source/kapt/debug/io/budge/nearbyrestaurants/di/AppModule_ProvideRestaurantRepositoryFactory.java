package io.budge.nearbyrestaurants.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.budge.nearbyrestaurants.data.api.IRestaurantsRepository;
import io.budge.nearbyrestaurants.data.api.RestaurantsApiService;

import javax.annotation.Generated;
import javax.inject.Provider;
import org.budge.nearbyrestaurants.data.api.IRestaurantsRepository;
import org.budge.nearbyrestaurants.data.api.RestaurantsApiService;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRestaurantRepositoryFactory implements Factory<IRestaurantsRepository> {
  private final AppModule module;

  private final Provider<RestaurantsApiService> restaurantsApiServiceProvider;

  public AppModule_ProvideRestaurantRepositoryFactory(AppModule module,
      Provider<RestaurantsApiService> restaurantsApiServiceProvider) {
    this.module = module;
    this.restaurantsApiServiceProvider = restaurantsApiServiceProvider;
  }

  @Override
  public IRestaurantsRepository get() {
    return provideRestaurantRepository(module, restaurantsApiServiceProvider.get());
  }

  public static AppModule_ProvideRestaurantRepositoryFactory create(AppModule module,
      Provider<RestaurantsApiService> restaurantsApiServiceProvider) {
    return new AppModule_ProvideRestaurantRepositoryFactory(module, restaurantsApiServiceProvider);
  }

  public static IRestaurantsRepository provideRestaurantRepository(AppModule instance,
      RestaurantsApiService restaurantsApiService) {
    return Preconditions.checkNotNull(instance.provideRestaurantRepository(restaurantsApiService), "Cannot return null from a non-@Nullable @Provides method");
  }
}
