package io.budge.nearbyrestaurants.restaurantslist;

import dagger.internal.Factory;
import io.budge.nearbyrestaurants.data.api.IRestaurantsRepository;

import javax.annotation.Generated;
import javax.inject.Provider;
import org.budge.nearbyrestaurants.data.api.IRestaurantsRepository;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RestaurantsListViewModel_Factory implements Factory<RestaurantsListViewModel> {
  private final Provider<IRestaurantsRepository> restaurantsRepositoryProvider;

  public RestaurantsListViewModel_Factory(
      Provider<IRestaurantsRepository> restaurantsRepositoryProvider) {
    this.restaurantsRepositoryProvider = restaurantsRepositoryProvider;
  }

  @Override
  public RestaurantsListViewModel get() {
    return newInstance(restaurantsRepositoryProvider.get());
  }

  public static RestaurantsListViewModel_Factory create(
      Provider<IRestaurantsRepository> restaurantsRepositoryProvider) {
    return new RestaurantsListViewModel_Factory(restaurantsRepositoryProvider);
  }

  public static RestaurantsListViewModel newInstance(IRestaurantsRepository restaurantsRepository) {
    return new RestaurantsListViewModel(restaurantsRepository);
  }
}
