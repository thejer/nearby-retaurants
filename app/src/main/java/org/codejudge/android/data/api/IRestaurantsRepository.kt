package org.codejudge.android.data.api

import org.codejudge.android.data.model.APIResponse
import org.codejudge.android.utils.Result

interface IRestaurantsRepository {
    suspend fun getAllRestaurants(): Result<APIResponse>

    suspend fun searchRestaurants(queryString: String): Result<APIResponse>
}