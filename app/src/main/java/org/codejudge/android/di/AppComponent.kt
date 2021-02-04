package org.codejudge.android.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import org.codejudge.android.restaurantslist.RestaurantsListActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [APIServiceModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(target: RestaurantsListActivity)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(app: Application): Builder
    }
}
