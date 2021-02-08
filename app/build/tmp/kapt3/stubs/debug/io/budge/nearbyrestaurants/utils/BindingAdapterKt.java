package io.budge.nearbyrestaurants.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007\u00a8\u0006\u0011"}, d2 = {"bindImageView", "", "imageView", "Landroid/widget/ImageView;", "url", "", "bindLoadingIndicator", "progressIndicator", "Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "isLoading", "", "bindRestaurants", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lio/budge/nearbyrestaurants/data/model/Restaurant;", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"isLoading"})
    public static final void bindLoadingIndicator(@org.jetbrains.annotations.NotNull()
    com.google.android.material.progressindicator.LinearProgressIndicator progressIndicator, boolean isLoading) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImageView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"restaurants"})
    public static final void bindRestaurants(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<io.budge.nearbyrestaurants.data.model.Restaurant> data) {
    }
}