package com.example.propertyfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstProperty = findViewById<ImageView>(R.id.firstPropertyPic)
        firstProperty.setOnClickListener {
            val intent = Intent(this, FirstPropertyDetails::class.java)
            // sending this extra message to another view i.e. to first property view
            intent.putExtra(
                "firstProperty",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                        "It has survived not only five centuries, but also the leap into electronic typesetting, remaining " +
                        "essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing " +
                        "Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including " +
                        "versions of Lorem Ipsum."
            )

            intent.putExtra("keyRent","$123,456 - House For Rent")
            startActivity(intent)

        }
    }
}