package com.app.dependencyinjection

import dagger.Module
import dagger.Provides

@Module
class AnalyticsModule {

    @Provides
    fun getAnalytics(): AnalyticsServices {
        return MixPanelAnalytics()
    }

}