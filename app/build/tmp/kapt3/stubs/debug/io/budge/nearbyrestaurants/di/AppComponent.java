package io.budge.nearbyrestaurants.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lio/budge/nearbyrestaurants/di/AppComponent;", "", "inject", "", "target", "Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsListActivity;", "Builder", "app_debug"})
@dagger.Component(modules = {io.budge.nearbyrestaurants.di.APIServiceModule.class, io.budge.nearbyrestaurants.di.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    io.budge.nearbyrestaurants.restaurantslist.RestaurantsListActivity target);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lio/budge/nearbyrestaurants/di/AppComponent$Builder;", "", "application", "app", "Landroid/app/Application;", "build", "Lio/budge/nearbyrestaurants/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.budge.nearbyrestaurants.di.AppComponent build();
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract io.budge.nearbyrestaurants.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application app);
    }
}