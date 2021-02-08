package io.budge.nearbyrestaurants.restaurantslist;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class RestaurantsListActivity_MembersInjector implements MembersInjector<RestaurantsListActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public RestaurantsListActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<RestaurantsListActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new RestaurantsListActivity_MembersInjector(viewModelFactoryProvider);}

  @Override
  public void injectMembers(RestaurantsListActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("org.codejudge.android.restaurantslist.RestaurantsListActivity.viewModelFactory")
  public static void injectViewModelFactory(RestaurantsListActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
