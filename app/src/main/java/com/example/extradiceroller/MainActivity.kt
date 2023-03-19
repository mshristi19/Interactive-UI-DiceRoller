package com.example.extradiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstDice: TextView = findViewById(R.id.firstDice)
        val secondDice: TextView = findViewById(R.id.secondDice)
        val rollButton: Button = findViewById(R.id.buttonRoll)

        rollButton.setOnClickListener{
            val diceNumber = (1..6).random();
            firstDice.text = "" +diceNumber;
            val diceNumber2 = (1..6).random();
            secondDice.text = "" +diceNumber2
        }
    }
}