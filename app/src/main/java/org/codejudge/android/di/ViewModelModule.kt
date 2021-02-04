package org.codejudge.android.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import org.codejudge.android.restaurantslist.RestaurantsListViewModel

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
