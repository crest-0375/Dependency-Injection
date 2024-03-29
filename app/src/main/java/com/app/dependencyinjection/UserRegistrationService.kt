package com.app.dependencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier
    private val notificationService: NotificationService
) {


    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "jemishkhunt@gmail.com", "User Registered.")
    }
}