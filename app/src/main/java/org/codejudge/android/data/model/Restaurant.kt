package org.codejudge.android.data.model

import com.google.gson.annotations.SerializedName
import org.codejudge.android.utils.Constants

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
    val openingHours: OpeningHours,
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
        return "${Constants.IMAGE_BASE_URL}&photoreference=${photos[0].photoReference}&key=${Constants.AUTH_KEY}"
    }
}