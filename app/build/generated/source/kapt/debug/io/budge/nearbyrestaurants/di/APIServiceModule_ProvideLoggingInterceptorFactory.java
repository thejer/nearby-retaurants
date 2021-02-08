package io.budge.nearbyrestaurants.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIServiceModule_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final APIServiceModule module;

  public APIServiceModule_ProvideLoggingInterceptorFactory(APIServiceModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideLoggingInterceptor(module);
  }

  public static APIServiceModule_ProvideLoggingInterceptorFactory create(APIServiceModule module) {
    return new APIServiceModule_ProvideLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor provideLoggingInterceptor(APIServiceModule instance) {
    return Preconditions.checkNotNull(instance.provideLoggingInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
