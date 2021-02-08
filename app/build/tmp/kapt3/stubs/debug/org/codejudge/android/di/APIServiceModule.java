package org.codejudge.android.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J \u0010\r\u001a\u00020\u000e2\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007\u00a8\u0006\u0014"}, d2 = {"Lorg/codejudge/android/di/APIServiceModule;", "", "()V", "provideGenericOkHttpClient", "Lokhttp3/OkHttpClient;", "interceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideGson", "Lcom/google/gson/Gson;", "provideGsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "gson", "provideLoggingInterceptor", "provideRestaurantsAPIService", "Lorg/codejudge/android/data/api/RestaurantsApiService;", "client", "Ldagger/Lazy;", "provideRestaurantsServiceHttpClient", "upstream", "Companion", "app_debug"})
@dagger.Module(includes = {org.codejudge.android.di.AppModule.class})
public final class APIServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUTH_KEY = "AIzaSyD0AQBJ_BwInY5Tv_0tqGPJIWL7FcllnH0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCATION_PARAM = "47.6204,-122.3491";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RADIUS_PARAM = "2500";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_PARAM = "restaurant";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://maps.googleapis.com/";
    @org.jetbrains.annotations.NotNull()
    public static final org.codejudge.android.di.APIServiceModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @javax.inject.Named(value = "RestaurantsApiService")
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideRestaurantsServiceHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient upstream) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final org.codejudge.android.data.api.RestaurantsApiService provideRestaurantsAPIService(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "RestaurantsApiService")
    dagger.Lazy<okhttp3.OkHttpClient> client, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideGenericOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor interceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.converter.gson.GsonConverterFactory provideGsonConverterFactory(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    public APIServiceModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/codejudge/android/di/APIServiceModule$Companion;", "", "()V", "AUTH_KEY", "", "BASE_URL", "LOCATION_PARAM", "RADIUS_PARAM", "TYPE_PARAM", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}