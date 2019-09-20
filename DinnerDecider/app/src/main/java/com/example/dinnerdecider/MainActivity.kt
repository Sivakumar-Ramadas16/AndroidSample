package com.example.dinnerdecider

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

//Changes Done Added one line
  //  var Foodlist = arrayListOf<String>("Chinese", "Pizza","Hamburger","Italian", "American1")
    var Foodlist = arrayListOf<String>("Chinese", "Pizza", "Hamburger", "Italian", "American", "🎏 Food",
    "🌹 Rose Flower Briyani", "🐔 Chicken Briyani", "\uD83E\uDD55 Carrot Halwa")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val bitmap = BitmapFactory.decodeResource(resources,R.drawable.dinner_plate)
        val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.isCircular = true
        ivDinnerPlate.setImageDrawable(rounded)*/

        FoodTxt.setText("Sri Rama Jayam")
        var i:Int = 0
       btnDecide.setOnClickListener {
        val random = Random()
           val randomFood = random.nextInt(Foodlist.size)
           FoodTxt.setText(Foodlist[randomFood])
           val bitmap = BitmapFactory.decodeResource(resources,R.drawable.dinner_plate)
           val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
           rounded.isCircular = true
           ivDinnerPlate.setImageDrawable(rounded)
           }

        btnAddFood.setOnClickListener {
            if (AddFoodText.text.length > 1) {
                Foodlist.add(AddFoodText.text.toString())
            }
            println(Foodlist)
            AddFoodText.text.clear()
            val bitmap = BitmapFactory.decodeResource(resources,R.drawable.dinner_plate)
            val rounded = RoundedBitmapDrawableFactory.create(resources,bitmap)
          //  rounded.cornerRadius = 15f
            rounded .isCircular = false
            ivDinnerPlate.setImageDrawable(rounded)
        }

       }

    }

