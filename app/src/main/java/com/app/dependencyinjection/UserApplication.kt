package com.app.dependencyinjection

import android.app.Application

class UserApplication : Application() {

    lateinit var appComponent: AppComponent
    //    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()

    }
}