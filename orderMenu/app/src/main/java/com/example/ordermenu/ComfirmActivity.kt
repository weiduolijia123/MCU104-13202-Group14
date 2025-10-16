package com.example.ordermenu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.PixelCopy
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class ComfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comfirm)

        var txtAll=findViewById<TextView>(R.id.All)

        val mainmeal=intent.getStringExtra("OM")
        val mainside=intent.getStringExtra("OS")
        val maindrink=intent.getStringExtra("OD")

        var Sum= StringBuilder()
            Sum.append(mainmeal)
            Sum.append("\n\n")
            Sum.append(mainside)
            Sum.append("\n\n")
            Sum.append(maindrink)
        txtAll.text=Sum


    }


    }