package com.app.dependencyinjection

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

//    fun getUserRegistrationService(): UserRegistrationService
//
//    fun getEmailService() : EmailService

    fun inject(mainActivity: MainActivity)

//    @Subcomponent.Factory
//    interface Factory {
//        fun create(@BindsInstance reTry: Int): UserRegistrationComponent
//    }
}