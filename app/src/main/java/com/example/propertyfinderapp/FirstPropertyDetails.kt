package com.example.propertyfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FirstPropertyDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_property_details)

        val messageFromMainPage = intent.getStringExtra("firstProperty")

        val longDesc = findViewById<TextView>(R.id.longDesc)
        longDesc.text = messageFromMainPage

        val rentalPurpose = intent.getStringExtra("keyRent")
        val rental = findViewById<TextView>(R.id.pricingTag)
        rental.text = rentalPurpose
    }
}