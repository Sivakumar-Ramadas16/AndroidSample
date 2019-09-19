package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

//Changes Done Added one line
    var Foodlist = arrayListOf<String>("Chinese", "Pizza","Hamburger","Italian", "American1")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FoodTxt.setText("Sri Rama Jayam")
        var i:Int = 0
       btnDecide.setOnClickListener {
        val random = Random()
           val randomFood = random.nextInt(Foodlist.size)
           FoodTxt.setText(Foodlist[randomFood])
           }

        btnAddFood.setOnClickListener {
            if (AddFoodText.text.length > 1) {
                Foodlist.add(AddFoodText.text.toString())
            }
            println(Foodlist)
            AddFoodText.text.clear()
        }

       }

    }

