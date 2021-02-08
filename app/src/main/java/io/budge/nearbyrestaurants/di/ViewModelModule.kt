package io.budge.nearbyrestaurants.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.budge.nearbyrestaurants.restaurantslist.RestaurantsListViewModel

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(RestaurantsListViewModel::class)
    abstract fun bindRestaurantsListViewModel(viewModel: RestaurantsListViewModel): ViewModel
}
