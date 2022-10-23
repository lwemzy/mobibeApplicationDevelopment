package com.lwemzy.dinnerdeciderapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val foodList:ArrayList<String> = arrayListOf("Hamburger", "Pizza","Mexican", "American", "Chinese")
        val btnDecide = findViewById<Button>(R.id.btn_decide);
        val btnAddFood = findViewById<Button>(R.id.btn_addfood);
        val txtFoodType = findViewById<TextView>(R.id.txt_foodType);
        val txtEditFodName = findViewById<EditText>(R.id.txt_addfood);

        btnDecide.setOnClickListener {
            val len:Int = foodList.size
            val randIndex:Int = (0 until len).random()
            txtFoodType.text= foodList[randIndex]
        }

        btnAddFood.setOnClickListener {
            val foodName:String = txtEditFodName.text.toString()
            foodList.add(foodName)
            txtEditFodName.setText("")
        }
    }
}