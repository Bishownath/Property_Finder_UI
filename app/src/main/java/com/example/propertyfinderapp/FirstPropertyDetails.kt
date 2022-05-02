package com.example.propertyfinderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

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


        var index = 0
        val image = intent?.getIntegerArrayList("allImages")

        val firstPropImage = findViewById<ImageView>(R.id.firstPropertyImage)
        firstPropImage.setImageResource(image!![index])
        firstPropImage.setOnClickListener {
            index++
            if (index == image!!.size) {
                index = 0
            }
            firstPropImage.setImageResource(image!![index])
        }
    }
}