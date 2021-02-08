package org.codejudge.android.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lorg/codejudge/android/data/api/RestaurantsRepository;", "Lorg/codejudge/android/data/api/IRestaurantsRepository;", "apiService", "Lorg/codejudge/android/data/api/RestaurantsApiService;", "(Lorg/codejudge/android/data/api/RestaurantsApiService;)V", "getAllRestaurants", "Lorg/codejudge/android/utils/Result;", "Lorg/codejudge/android/data/model/APIResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchRestaurants", "queryString", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RestaurantsRepository implements org.codejudge.android.data.api.IRestaurantsRepository {
    private final org.codejudge.android.data.api.RestaurantsApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllRestaurants(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.codejudge.android.utils.Result<org.codejudge.android.data.model.APIResponse>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchRestaurants(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.codejudge.android.utils.Result<org.codejudge.android.data.model.APIResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public RestaurantsRepository(@org.jetbrains.annotations.NotNull()
    org.codejudge.android.data.api.RestaurantsApiService apiService) {
        super();
    }
}