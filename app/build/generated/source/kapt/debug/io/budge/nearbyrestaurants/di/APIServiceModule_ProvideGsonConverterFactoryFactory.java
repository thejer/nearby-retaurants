package io.budge.nearbyrestaurants.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.converter.gson.GsonConverterFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIServiceModule_ProvideGsonConverterFactoryFactory implements Factory<GsonConverterFactory> {
  private final APIServiceModule module;

  private final Provider<Gson> gsonProvider;

  public APIServiceModule_ProvideGsonConverterFactoryFactory(APIServiceModule module,
      Provider<Gson> gsonProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public GsonConverterFactory get() {
    return provideGsonConverterFactory(module, gsonProvider.get());
  }

  public static APIServiceModule_ProvideGsonConverterFactoryFactory create(APIServiceModule module,
      Provider<Gson> gsonProvider) {
    return new APIServiceModule_ProvideGsonConverterFactoryFactory(module, gsonProvider);
  }

  public static GsonConverterFactory provideGsonConverterFactory(APIServiceModule instance,
      Gson gson) {
    return Preconditions.checkNotNull(instance.provideGsonConverterFactory(gson), "Cannot return null from a non-@Nullable @Provides method");
  }
}
