package org.codejudge.android.data.api

import org.codejudge.android.data.model.APIResponse
import org.codejudge.android.utils.GENERIC_ERROR_CODE
import org.codejudge.android.utils.GENERIC_ERROR_MESSAGE
import org.codejudge.android.utils.Result
import org.codejudge.android.utils.getAPIResult
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