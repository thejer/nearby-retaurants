package io.budge.nearbyrestaurants.databinding;
import io.budge.nearbyrestaurants.R;
import io.budge.nearbyrestaurants.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class RestaurantItemBindingImpl extends RestaurantItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.restaurant_text, 5);
        sViewsWithIds.put(R.id.rating_layout, 6);
        sViewsWithIds.put(R.id.open_status, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RestaurantItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RestaurantItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[6]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.address.setTag(null);
        this.foodImage.setTag(null);
        this.rating.setTag(null);
        this.restaurantCard.setTag(null);
        this.restaurantName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.restaurant == variableId) {
            setRestaurant((io.budge.nearbyrestaurants.data.model.Restaurant) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRestaurant(@Nullable io.budge.nearbyrestaurants.data.model.Restaurant Restaurant) {
        this.mRestaurant = Restaurant;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.restaurant);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String restaurantRatingString = null;
        java.lang.String restaurantVicinity = null;
        java.lang.String RestaurantName1 = null;
        java.lang.String restaurantRestaurantImage = null;
        io.budge.nearbyrestaurants.data.model.Restaurant restaurant = mRestaurant;

        if ((dirtyFlags & 0x3L) != 0) {



                if (restaurant != null) {
                    // read restaurant.ratingString
                    restaurantRatingString = restaurant.getRatingString();
                    // read restaurant.vicinity
                    restaurantVicinity = restaurant.getVicinity();
                    // read restaurant.name
                    RestaurantName1 = restaurant.getName();
                    // read restaurant.restaurantImage
                    restaurantRestaurantImage = restaurant.getRestaurantImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, restaurantVicinity);
            io.budge.nearbyrestaurants.utils.BindingAdapterKt.bindImageView(this.foodImage, restaurantRestaurantImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rating, restaurantRatingString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.restaurantName, RestaurantName1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): restaurant
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}