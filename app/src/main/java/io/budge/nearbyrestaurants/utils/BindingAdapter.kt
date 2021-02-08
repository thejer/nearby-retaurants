package io.budge.nearbyrestaurants.utils

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.google.android.material.progressindicator.LinearProgressIndicator
import io.budge.nearbyrestaurants.data.model.Restaurant
import io.budge.nearbyrestaurants.restaurantslist.RestaurantsAdapter
import org.budge.nearbyrestaurants.R


@BindingAdapter("isLoading")
fun bindLoadingIndicator(progressIndicator: LinearProgressIndicator, isLoading: Boolean) {
    if (isLoading) progressIndicator.visibility = View.VISIBLE
    else progressIndicator.visibility = View.GONE
}


@BindingAdapter("imageUrl")
fun bindImageView(imageView: ImageView, url: String?) {
    imageView.load(url) {
        placeholder(R.drawable.ic_food)
        error(R.drawable.ic_food)
        crossfade(true)
    }
}

@BindingAdapter("restaurants")
fun bindRestaurants(recyclerView: RecyclerView, data: MutableList<Restaurant>?) {
    val adapter = recyclerView.adapter as RestaurantsAdapter
    adapter.submitList(data)
}