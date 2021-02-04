package org.codejudge.android.data.api

import android.util.Log
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
            Log.d("searchRestaurants", "searchRestaurants: ${e.localizedMessage}")
            Result.Error(GENERIC_ERROR_CODE, GENERIC_ERROR_MESSAGE)
        }
    }

    override suspend fun searchRestaurants(queryString: String): Result<APIResponse> {
        return try {
            getAPIResult(apiService.getRestaurants(queryString))
        } catch (e: Exception) {
            Log.d("searchRestaurants", "searchRestaurants: ${e.localizedMessage}")
            Result.Error(GENERIC_ERROR_CODE, GENERIC_ERROR_MESSAGE)
        }
    }

}