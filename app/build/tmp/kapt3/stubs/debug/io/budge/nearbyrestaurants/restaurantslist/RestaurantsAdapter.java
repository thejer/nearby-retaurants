package io.budge.nearbyrestaurants.restaurantslist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/budge/nearbyrestaurants/data/model/Restaurant;", "Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsAdapter$RestaurantsViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "RestaurantsViewHolder", "app_debug"})
public final class RestaurantsAdapter extends androidx.recyclerview.widget.ListAdapter<io.budge.nearbyrestaurants.data.model.Restaurant, io.budge.nearbyrestaurants.restaurantslist.RestaurantsAdapter.RestaurantsViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final io.budge.nearbyrestaurants.restaurantslist.RestaurantsAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.budge.nearbyrestaurants.restaurantslist.RestaurantsAdapter.RestaurantsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.budge.nearbyrestaurants.restaurantslist.RestaurantsAdapter.RestaurantsViewHolder holder, int position) {
    }
    
    public RestaurantsAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsAdapter$RestaurantsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lio/budge/nearbyrestaurants/databinding/RestaurantItemBinding;", "(Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsAdapter;Lio/budge/nearbyrestaurants/databinding/RestaurantItemBinding;)V", "bind", "", "item", "Lio/budge/nearbyrestaurants/data/model/Restaurant;", "app_debug"})
    public final class RestaurantsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final io.budge.nearbyrestaurants.databinding.RestaurantItemBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.budge.nearbyrestaurants.data.model.Restaurant item) {
        }
        
        public RestaurantsViewHolder(@org.jetbrains.annotations.NotNull()
        io.budge.nearbyrestaurants.databinding.RestaurantItemBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lio/budge/nearbyrestaurants/restaurantslist/RestaurantsAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/budge/nearbyrestaurants/data/model/Restaurant;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<io.budge.nearbyrestaurants.data.model.Restaurant> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        io.budge.nearbyrestaurants.data.model.Restaurant oldItem, @org.jetbrains.annotations.NotNull()
        io.budge.nearbyrestaurants.data.model.Restaurant newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        io.budge.nearbyrestaurants.data.model.Restaurant oldItem, @org.jetbrains.annotations.NotNull()
        io.budge.nearbyrestaurants.data.model.Restaurant newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}