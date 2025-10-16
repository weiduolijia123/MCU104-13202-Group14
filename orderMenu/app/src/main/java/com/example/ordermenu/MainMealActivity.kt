package com.example.ordermenu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf

class MainMealActivity : AppCompatActivity() {
    private lateinit var GPMainMeal: RadioGroup
    private lateinit var MainDone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_meal)

        GPMainMeal = findViewById<RadioGroup>(R.id.GPMainMeal)
        MainDone = findViewById<Button>(R.id.MainDone)

        MainDone.setOnClickListener {

            var b=bundleOf(
                "GPMainMeal" to GPMainMeal.findViewById<RadioButton>(GPMainMeal.checkedRadioButtonId).text.toString()
            )
            var i=Intent().putExtras(b)
                setResult(RESULT_OK, i)
                finish()

            }

        }

    }




