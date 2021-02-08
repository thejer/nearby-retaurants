package io.budge.nearbyrestaurants.restaurantslist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import io.budge.nearbyrestaurants.data.model.Restaurant
import org.budge.nearbyrestaurants.R
import org.budge.nearbyrestaurants.databinding.RestaurantItemBinding

class RestaurantsAdapter : ListAdapter<Restaurant, RestaurantsAdapter.RestaurantsViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsViewHolder {
        return RestaurantsViewHolder(
                RestaurantItemBinding
                        .bind(LayoutInflater.from(parent.context)
                                .inflate(
                                        R.layout.restaurant_item,
                                        parent,
                                        false
                                )))
    }

    override fun onBindViewHolder(holder: RestaurantsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Restaurant>() {

        override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean =
                oldItem.reference == newItem.reference

        override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean =
                oldItem == newItem
    }

    inner class RestaurantsViewHolder(private val binding: RestaurantItemBinding) :
            RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Restaurant) {
            val context = binding.root.context
            binding.restaurant = item
            val isOpen = item.businessStatus == "OPERATIONAL" && item.openingHours?.openNow ?: false
            binding.openStatus.apply {
                if (isOpen) {
                    text = context.getString(R.string.open)
                    setTextColor(ContextCompat.getColor(context, R.color.open_green))
                } else {
                    text = context.getString(R.string.closed)
                    setTextColor(ContextCompat.getColor(context, R.color.closed_red))
                }
            }
            binding.executePendingBindings()
        }
    }
}