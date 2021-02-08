package io.budge.nearbyrestaurants.restaurantslist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.budge.nearbyrestaurants.data.api.IRestaurantsRepository
import io.budge.nearbyrestaurants.data.model.Restaurant
import kotlinx.coroutines.launch
import javax.inject.Inject
import io.budge.nearbyrestaurants.utils.Result

class RestaurantsListViewModel @Inject constructor(
        private val restaurantsRepository: IRestaurantsRepository
) : ViewModel() {

    private val _restaurants = MutableLiveData<MutableList<Restaurant>>()
    val restaurants: LiveData<MutableList<Restaurant>>
        get() = _restaurants

    private val _isLoading = MutableLiveData(false)
    val isLoading: LiveData<Boolean>
        get() = _isLoading

    private val _errorMessage = MutableLiveData<String>()
    val errorMessage: LiveData<String>
        get() = _errorMessage

    fun getAllRestaurants() {
        _isLoading.value = true
        viewModelScope.launch {
            when (val result = restaurantsRepository.getAllRestaurants()) {
                is Result.Success -> {
                    _isLoading.value = false
                    _restaurants.value = result.data.results
                }
                is Result.Error -> {
                    _isLoading.value = false
                    _errorMessage.value = result.errorMessage
                }
            }
        }
    }

    fun searchRestaurants(queryString: String) {
        _isLoading.value = true
        viewModelScope.launch {
            when (val result = restaurantsRepository.searchRestaurants(queryString)) {
                is Result.Success -> {
                    _isLoading.value = false
                    _restaurants.value = result.data.results
                }
                is Result.Error -> {
                    _isLoading.value = false
                    _errorMessage.value = result.errorMessage
                }
            }
        }
    }
}