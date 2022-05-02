package com.example.propertyfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class FirstPropertyDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_property_details)

        val intent = intent.extras

        val titleDetails = findViewById<TextView>(R.id.titleDetails)
        titleDetails.text = intent?.getString("titles")

        val descDetails = findViewById<TextView>(R.id.descriptionDetails)
        descDetails.text = intent?.getString("description")

        val bedroom = findViewById<TextView>(R.id.bedroomCountDetails)
        bedroom.text = intent?.getInt("bedrooms").toString()

        val bathroom = findViewById<TextView>(R.id.bathroomCountDetails)
        bathroom.text = intent?.getInt("bathrooms").toString()

        val buildYear = findViewById<TextView>(R.id.buildYearDetails)
        buildYear.text = intent?.getInt("buildYear").toString()
    }
}