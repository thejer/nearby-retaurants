package io.budge.nearbyrestaurants

import android.app.Application
import io.budge.nearbyrestaurants.di.AppComponent


class App : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = _root_ide_package_.io.budge.nearbyrestaurants.di.DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}
