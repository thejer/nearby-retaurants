package io.budge.nearbyrestaurants.di

import dagger.Module
import dagger.Provides
import io.budge.nearbyrestaurants.data.api.IRestaurantsRepository
import io.budge.nearbyrestaurants.data.api.RestaurantsApiService
import io.budge.nearbyrestaurants.data.api.RestaurantsRepository
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideRestaurantRepository(restaurantsApiService: RestaurantsApiService): IRestaurantsRepository {
        return RestaurantsRepository(restaurantsApiService)
    }
}