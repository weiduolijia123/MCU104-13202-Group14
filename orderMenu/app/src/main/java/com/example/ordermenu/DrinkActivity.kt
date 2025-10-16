package com.example.ordermenu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf

class DrinkActivity : AppCompatActivity() {
    private lateinit var GPDrink: RadioGroup
    private lateinit var DrinkDone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        GPDrink = findViewById<RadioGroup>(R.id.GPDrink)
        DrinkDone = findViewById<Button>(R.id.DrinkDone)

        DrinkDone.setOnClickListener {
            var b=bundleOf(
                "GPDrink" to GPDrink.findViewById<RadioButton>(GPDrink.checkedRadioButtonId).text.toString()
            )
            var i=Intent().putExtras(b)
            setResult(RESULT_OK, i)
            finish()

        }
    }
}
