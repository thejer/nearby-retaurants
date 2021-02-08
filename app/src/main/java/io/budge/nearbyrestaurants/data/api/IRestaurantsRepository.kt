package io.budge.nearbyrestaurants.data.api

import io.budge.nearbyrestaurants.data.model.APIResponse
import io.budge.nearbyrestaurants.utils.Result

interface IRestaurantsRepository {
    suspend fun getAllRestaurants(): Result<APIResponse>

    suspend fun searchRestaurants(queryString: String): Result<APIResponse>
}