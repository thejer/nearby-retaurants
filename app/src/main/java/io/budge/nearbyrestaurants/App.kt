package io.budge.nearbyrestaurants

import android.app.Application
import io.budge.nearbyrestaurants.di.AppComponent
import io.budge.nearbyrestaurants.di.DaggerAppComponent


class App : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}
