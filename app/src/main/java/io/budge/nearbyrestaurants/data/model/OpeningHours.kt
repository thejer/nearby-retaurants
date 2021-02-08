package io.budge.nearbyrestaurants.data.model

import com.google.gson.annotations.SerializedName

data class OpeningHours(
        @SerializedName("open_now")
        val openNow: Boolean
)