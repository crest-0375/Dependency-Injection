package com.app.dependencyinjection

import android.content.ContentValues.TAG
import android.util.Log

interface AnalyticsServices {
    fun trackEvent(eventName: String, eventType: String)
}

class MixPanelAnalytics : AnalyticsServices {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel Analytics - $eventName - $eventType")
    }
}

class FireBaseAnalytics : AnalyticsServices {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Firebase Analytics - $eventName - $eventType")
    }
}