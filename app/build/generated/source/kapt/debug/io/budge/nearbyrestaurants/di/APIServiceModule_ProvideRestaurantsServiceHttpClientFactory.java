package io.budge.nearbyrestaurants.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIServiceModule_ProvideRestaurantsServiceHttpClientFactory implements Factory<OkHttpClient> {
  private final APIServiceModule module;

  private final Provider<OkHttpClient> upstreamProvider;

  public APIServiceModule_ProvideRestaurantsServiceHttpClientFactory(APIServiceModule module,
      Provider<OkHttpClient> upstreamProvider) {
    this.module = module;
    this.upstreamProvider = upstreamProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideRestaurantsServiceHttpClient(module, upstreamProvider.get());
  }

  public static APIServiceModule_ProvideRestaurantsServiceHttpClientFactory create(
      APIServiceModule module, Provider<OkHttpClient> upstreamProvider) {
    return new APIServiceModule_ProvideRestaurantsServiceHttpClientFactory(module, upstreamProvider);
  }

  public static OkHttpClient provideRestaurantsServiceHttpClient(APIServiceModule instance,
      OkHttpClient upstream) {
    return Preconditions.checkNotNull(instance.provideRestaurantsServiceHttpClient(upstream), "Cannot return null from a non-@Nullable @Provides method");
  }
}
