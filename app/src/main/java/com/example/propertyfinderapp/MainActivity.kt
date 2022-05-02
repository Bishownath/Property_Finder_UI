package com.example.propertyfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : AppCompatActivity(), View.OnClickListener {

    val titles = arrayListOf<String>()
    val description = arrayListOf<String>()
    val bedroom = intArrayOf(3, 2, 4)
    val bathrooms = intArrayOf(2, 2, 3)
    val year = intArrayOf(2010, 2002, 2022)


    fun populate() {
        titles.add("First Rent")
        titles.add("Second Rent Apartment")
        titles.add("Third House For Sale")

        description.add("First Description")
        description.add("Second Description")
        description.add("Third Description")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populate()

        mainViews()
    }

    fun mainViews() {

        firstCard()

        secondCard()

        thirdCard()

    }


    fun firstCard() {
        val firstCard = findViewById<LinearLayout>(R.id.firstCard)
        firstCard.setOnClickListener(this)

        val firstDesc = findViewById<TextView>(R.id.firstDesc)
        firstDesc.text = titles[0]

        val bedroomCount_1 = findViewById<TextView>(R.id.bedroomCount_1)
        bedroomCount_1.text = bedroom[0].toString()

        val bathroomCount_1 = findViewById<TextView>(R.id.bathroomCount_1)
        bathroomCount_1.text = bathrooms[0].toString()

        val buildYear_1 = findViewById<TextView>(R.id.buildYear_1)
        buildYear_1.text = year[0].toString()

        val secondCard = findViewById<LinearLayout>(R.id.secondCard)
        secondCard.setOnClickListener(this)
    }


    fun secondCard() {
        val secondDesc = findViewById<TextView>(R.id.secondDesc)
        secondDesc.text = titles[1]

        val bedroomCount_2 = findViewById<TextView>(R.id.bedroomCount_2)
        bedroomCount_2.text = bedroom[1].toString()

        val bathroomCount_2 = findViewById<TextView>(R.id.bathroomCount_2)
        bathroomCount_2.text = bathrooms[1].toString()

        val buildYear_2 = findViewById<TextView>(R.id.buildYear_2)
        buildYear_2.text = year[1].toString()
    }


    fun thirdCard() {
        val thirdDesc = findViewById<TextView>(R.id.thirdDesc)
        thirdDesc.text = titles[2]

        val thirdCard = findViewById<LinearLayout>(R.id.thirdCard)
        thirdCard.setOnClickListener(this)

        val bedroomCount_3 = findViewById<TextView>(R.id.bedroomCount_3)
        bedroomCount_3.text = bedroom[2].toString()


        val bathroomCount_3 = findViewById<TextView>(R.id.bathroomCount_3)
        bathroomCount_3.text = bathrooms[2].toString()

        val buildYear_3 = findViewById<TextView>(R.id.buildYear_3)
        buildYear_3.text = year[2].toString()
    }


    override fun onClick(view: View?) {
        var index = 0

        when (view!!.id) {
            R.id.firstCard -> index = 0
            R.id.secondCard -> index = 1
            R.id.thirdCard -> index = 2
        }
        val intent = Intent(this, FirstPropertyDetails::class.java)
        val bundles = Bundle()

        bundles.putString("titles", titles[index])
        bundles.putString("description", description[index])
        bundles.putInt("bedrooms", bedroom[index])
        bundles.putInt("bathrooms", bathrooms[index])
        bundles.putInt("buildYear", year[index])

        intent.putExtras(bundles)
        startActivity(intent)
    }
}