package io.budge.nearbyrestaurants.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class APIServiceModule_ProvideGenericOkHttpClientFactory implements Factory<OkHttpClient> {
  private final APIServiceModule module;

  private final Provider<HttpLoggingInterceptor> interceptorProvider;

  public APIServiceModule_ProvideGenericOkHttpClientFactory(APIServiceModule module,
      Provider<HttpLoggingInterceptor> interceptorProvider) {
    this.module = module;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideGenericOkHttpClient(module, interceptorProvider.get());
  }

  public static APIServiceModule_ProvideGenericOkHttpClientFactory create(APIServiceModule module,
      Provider<HttpLoggingInterceptor> interceptorProvider) {
    return new APIServiceModule_ProvideGenericOkHttpClientFactory(module, interceptorProvider);
  }

  public static OkHttpClient provideGenericOkHttpClient(APIServiceModule instance,
      HttpLoggingInterceptor interceptor) {
    return Preconditions.checkNotNull(instance.provideGenericOkHttpClient(interceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
