package com.app.dependencyinjection

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}