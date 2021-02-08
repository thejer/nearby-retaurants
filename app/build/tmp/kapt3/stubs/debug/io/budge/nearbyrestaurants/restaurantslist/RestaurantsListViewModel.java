package io.budge.nearbyrestaurants.restaurantslist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsListViewModel;", "Landroidx/lifecycle/ViewModel;", "restaurantsRepository", "Lio/budge/nearbyrestaurants/data/api/IRestaurantsRepository;", "(Lio/budge/nearbyrestaurants/data/api/IRestaurantsRepository;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_isLoading", "", "kotlin.jvm.PlatformType", "_restaurants", "", "Lio/budge/nearbyrestaurants/data/model/Restaurant;", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "isLoading", "restaurants", "getRestaurants", "getAllRestaurants", "", "searchRestaurants", "queryString", "app_debug"})
public final class RestaurantsListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<io.budge.nearbyrestaurants.data.model.Restaurant>> _restaurants = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    private final io.budge.nearbyrestaurants.data.api.IRestaurantsRepository restaurantsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.budge.nearbyrestaurants.data.model.Restaurant>> getRestaurants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void getAllRestaurants() {
    }
    
    public final void searchRestaurants(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
    }
    
    @javax.inject.Inject()
    public RestaurantsListViewModel(@org.jetbrains.annotations.NotNull()
    io.budge.nearbyrestaurants.data.api.IRestaurantsRepository restaurantsRepository) {
        super();
    }
}