package io.budge.nearbyrestaurants.di;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import io.budge.nearbyrestaurants.data.api.IRestaurantsRepository;
import io.budge.nearbyrestaurants.data.api.RestaurantsApiService;
import io.budge.nearbyrestaurants.restaurantslist.RestaurantsListActivity;
import io.budge.nearbyrestaurants.restaurantslist.RestaurantsListActivity_MembersInjector;
import io.budge.nearbyrestaurants.restaurantslist.RestaurantsListViewModel;
import io.budge.nearbyrestaurants.restaurantslist.RestaurantsListViewModel_Factory;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<HttpLoggingInterceptor> provideLoggingInterceptorProvider;

  private Provider<OkHttpClient> provideGenericOkHttpClientProvider;

  private Provider<OkHttpClient> provideRestaurantsServiceHttpClientProvider;

  private Provider<Gson> provideGsonProvider;

  private Provider<RestaurantsApiService> provideRestaurantsAPIServiceProvider;

  private Provider<IRestaurantsRepository> provideRestaurantRepositoryProvider;

  private Provider<RestaurantsListViewModel> restaurantsListViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<AppViewModelFactory> appViewModelFactoryProvider;

  private DaggerAppComponent(APIServiceModule aPIServiceModuleParam, AppModule appModuleParam,
      Application application) {

    initialize(aPIServiceModuleParam, appModuleParam, application);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final APIServiceModule aPIServiceModuleParam,
      final AppModule appModuleParam, final Application application) {
    this.provideLoggingInterceptorProvider = DoubleCheck.provider(APIServiceModule_ProvideLoggingInterceptorFactory.create(aPIServiceModuleParam));
    this.provideGenericOkHttpClientProvider = DoubleCheck.provider(APIServiceModule_ProvideGenericOkHttpClientFactory.create(aPIServiceModuleParam, provideLoggingInterceptorProvider));
    this.provideRestaurantsServiceHttpClientProvider = DoubleCheck.provider(APIServiceModule_ProvideRestaurantsServiceHttpClientFactory.create(aPIServiceModuleParam, provideGenericOkHttpClientProvider));
    this.provideGsonProvider = DoubleCheck.provider(APIServiceModule_ProvideGsonFactory.create(aPIServiceModuleParam));
    this.provideRestaurantsAPIServiceProvider = DoubleCheck.provider(APIServiceModule_ProvideRestaurantsAPIServiceFactory.create(aPIServiceModuleParam, provideRestaurantsServiceHttpClientProvider, provideGsonProvider));
    this.provideRestaurantRepositoryProvider = DoubleCheck.provider(AppModule_ProvideRestaurantRepositoryFactory.create(appModuleParam, provideRestaurantsAPIServiceProvider));
    this.restaurantsListViewModelProvider = RestaurantsListViewModel_Factory.create(provideRestaurantRepositoryProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1).put(RestaurantsListViewModel.class, (Provider) restaurantsListViewModelProvider).build();
    this.appViewModelFactoryProvider = DoubleCheck.provider(AppViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(RestaurantsListActivity target) {
    injectRestaurantsListActivity(target);}

  private RestaurantsListActivity injectRestaurantsListActivity(RestaurantsListActivity instance) {
    RestaurantsListActivity_MembersInjector.injectViewModelFactory(instance, appViewModelFactoryProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application app) {
      this.application = Preconditions.checkNotNull(app);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(new APIServiceModule(), new AppModule(), application);
    }
  }
}
