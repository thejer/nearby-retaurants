package io.budge.nearbyrestaurants.data.model

import com.google.gson.annotations.SerializedName
import io.budge.nearbyrestaurants.utils.Constants

data class Restaurant(
        @SerializedName("business_status")
        val businessStatus: String,
        @SerializedName("icon")
        val icon: String,
        @SerializedName("name")
        val name: String,
        @SerializedName("permanently_closed")
        val permanentlyClosed: Boolean,
        @SerializedName("opening_hours")
        val openingHours: OpeningHours?,
        @SerializedName("price_level")
        val priceLevel: Int,
        @SerializedName("rating")
        val rating: Double,
        @SerializedName("photos")
        val photos: List<Photo>,
        @SerializedName("reference")
        val reference: String,
        @SerializedName("types")
        val types: List<String>,
        @SerializedName("user_ratings_total")
        val userRatingsTotal: Int,
        @SerializedName("vicinity")
        val vicinity: String
) {
    val ratingString: String
        get() = rating.toString()

    fun getRestaurantImage(): String {
        return String.format("%s%s&key=%s", Constants.IMAGE_BASE_URL, photos[0].photoReference, Constants.AUTH_KEY)
    }
}