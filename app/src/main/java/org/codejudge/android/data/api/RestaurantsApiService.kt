package org.codejudge.android.data.api

import org.codejudge.android.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestaurantsApiService {

    @GET("/maps/api/place/nearbysearch/json")
    suspend fun getRestaurants(@Query("keyword") searchQuery: String): Response<APIResponse>
}