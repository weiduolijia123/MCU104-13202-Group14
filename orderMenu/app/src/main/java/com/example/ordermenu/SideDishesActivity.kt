package com.example.ordermenu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.core.os.bundleOf


class SideDishesActivity : AppCompatActivity() {

    private lateinit var checkFries: CheckBox

    private lateinit var checkSalad: CheckBox

    private lateinit var checkCornCup: CheckBox

    private lateinit var SideDone: Button

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_side_dishes)

        checkFries=findViewById<CheckBox>(R.id.Fries)

        checkSalad=findViewById<CheckBox>(R.id.Salad)

        checkCornCup=findViewById<CheckBox>(R.id.CornCup)

        SideDone=findViewById<Button>(R.id.SideDone)

        checkFries.setOnClickListener {

        }

        checkSalad.setOnClickListener {

        }

        checkCornCup.setOnClickListener {

        }

        SideDone.setOnClickListener {
            var b=bundleOf(
                "checkFries" to checkFries.isChecked,
                "checkSalad" to checkSalad.isChecked,
            "checkCornCup" to checkCornCup.isChecked
            )
            var i=Intent().putExtras(b)
            setResult(RESULT_OK,i)
            finish()
        }




        }

    }