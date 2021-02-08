package io.budge.nearbyrestaurants.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
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
public final class AppViewModelFactory_Factory implements Factory<AppViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider;

  public AppViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    this.creatorsProvider = creatorsProvider;
  }

  @Override
  public AppViewModelFactory get() {
    return newInstance(creatorsProvider.get());
  }

  public static AppViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> creatorsProvider) {
    return new AppViewModelFactory_Factory(creatorsProvider);
  }

  public static AppViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> creators) {
    return new AppViewModelFactory(creators);
  }
}
