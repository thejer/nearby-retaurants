package io.budge.nearbyrestaurants.data.api

import io.budge.nearbyrestaurants.data.model.APIResponse
import io.budge.nearbyrestaurants.utils.GENERIC_ERROR_CODE
import io.budge.nearbyrestaurants.utils.GENERIC_ERROR_MESSAGE
import io.budge.nearbyrestaurants.utils.Result
import io.budge.nearbyrestaurants.utils.getAPIResult
import javax.inject.Inject

class RestaurantsRepository @Inject constructor(private val apiService: RestaurantsApiService) : IRestaurantsRepository {

    override suspend fun getAllRestaurants(): Result<APIResponse> {
        return try {
            getAPIResult(apiService.getRestaurants(""))
        } catch (e: Exception) {
            Result.Error(GENERIC_ERROR_CODE, GENERIC_ERROR_MESSAGE)
        }
    }

    override suspend fun searchRestaurants(queryString: String): Result<APIResponse> {
        return try {
            getAPIResult(apiService.getRestaurants(queryString))
        } catch (e: Exception) {
            Result.Error(GENERIC_ERROR_CODE, GENERIC_ERROR_MESSAGE)
        }
    }

}