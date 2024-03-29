package com.app.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsServices: AnalyticsServices) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in DB.")
        analyticsServices.trackEvent("save user", "CREATE")
    }
}

class FireBaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in FireBase.")
    }
}