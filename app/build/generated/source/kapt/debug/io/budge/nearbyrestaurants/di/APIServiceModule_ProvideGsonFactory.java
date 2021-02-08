package io.budge.nearbyrestaurants.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIServiceModule_ProvideGsonFactory implements Factory<Gson> {
  private final APIServiceModule module;

  public APIServiceModule_ProvideGsonFactory(APIServiceModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson(module);
  }

  public static APIServiceModule_ProvideGsonFactory create(APIServiceModule module) {
    return new APIServiceModule_ProvideGsonFactory(module);
  }

  public static Gson provideGson(APIServiceModule instance) {
    return Preconditions.checkNotNull(instance.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
