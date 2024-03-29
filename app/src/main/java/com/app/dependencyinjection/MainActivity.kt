package com.app.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = (application as UserApplication).appComponent
//        val userRegistrationService = component.getUserRegistrationService()
//        val emailService = component.getEmailService()

        val userRegistrationComponent = appComponent.getUserRegistrationComponent()

        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("jemishkhunt@gmail.com", "1111")
//        emailService.send("jemish", "khunt", "Hey you were there???")
    }
}
