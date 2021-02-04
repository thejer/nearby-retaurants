package org.codejudge.android

import android.app.Application
import org.codejudge.android.di.AppComponent
import org.codejudge.android.di.DaggerAppComponent


class App : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}
