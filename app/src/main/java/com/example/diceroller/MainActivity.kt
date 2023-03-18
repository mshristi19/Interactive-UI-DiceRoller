package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll: Button = findViewById(R.id.rollButton);
        roll.setOnClickListener{
            val toast = Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT);
            toast.show();
        }

        roll.setOnClickListener{
            rollDice();
        }


    }

    class Dice(val num: Int) {
        fun roll(): Int {
            return (1..num).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6);
        val rollDice = dice.roll();
        val diceResult: TextView = findViewById(R.id.diceResultText);
        diceResult.text = rollDice.toString();
    }
}