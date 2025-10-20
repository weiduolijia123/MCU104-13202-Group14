package com.example.ordermenu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.PixelCopy
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.os.bundleOf

class MainActivity : AppCompatActivity() {

    private lateinit var btnMainMeal: Button
    private lateinit var btnSideDish: Button
    private lateinit var btnDrink: Button
    private lateinit var btnComfirm: Button

    private lateinit var tvMeal: TextView
    private lateinit var tvSide: TextView
    private lateinit var tvDrink: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()
        setListeners()
        tvMeal=findViewById(R.id.txtM)
        tvDrink=findViewById(R.id.txtD)
        tvSide=findViewById(R.id.txtS)
    }

    private val MainMealResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    )
    {
            result: ActivityResult->
        if (result.resultCode==Activity.RESULT_OK){
            var intent=result.data
            var MainMeal=intent?.getStringExtra("GPMainMeal")
            tvMeal.text="Main-$MainMeal"
        }
    }

    private val SideDishResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    )
    {
            result: ActivityResult->
        if (result.resultCode==Activity.RESULT_OK){
            var intent=result.data
            val Fries=intent?.getBooleanExtra("checkFries",false)?:false
            val Salad=intent?.getBooleanExtra("checkSalad",false)?:false
            val CornCup=intent?.getBooleanExtra("checkCornCup",false)?:false
            val txt= StringBuilder("SideDishes-")
            if(Fries){
                txt.append("Fries ")
            }
            if(Salad){
                txt.append("Salad ")

            }
            if(CornCup){
                txt.append("CornCup")
            }
            tvSide.text=txt.toString()
        }
        }

    private val DrinkResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    )
    {
            result: ActivityResult->
        if (result.resultCode==Activity.RESULT_OK){
            var intent=result.data
            var Drink=intent?.getStringExtra("GPDrink")
            tvDrink.text="Drink-$Drink"
        }
    }


    private fun findViews() {
        btnMainMeal = findViewById(R.id.maimmeal)
        btnSideDish = findViewById(R.id.sidedish)
        btnDrink = findViewById(R.id.drink)
        btnComfirm = findViewById(R.id.Comfim)
    }

    private fun setListeners() {
        btnMainMeal.setOnClickListener {
            val intent = Intent(this, MainMealActivity::class.java)
            MainMealResult.launch(intent)
        }

        btnSideDish.setOnClickListener {
            val intent = Intent(this, SideDishesActivity::class.java)
            SideDishResult.launch(intent)
        }

        btnDrink.setOnClickListener {
            val intent = Intent(this, DrinkActivity::class.java)
            DrinkResult.launch(intent)
        }
        btnComfirm.setOnClickListener {
            val intent = Intent(this, ComfirmActivity::class.java)
            val TXTM=tvMeal.text.toString()
            val TXTS=tvSide.text.toString()
            val TXTD=tvDrink.text.toString()
            intent.putExtra("OM", TXTM)
            intent.putExtra("OS", TXTS)
            intent.putExtra("OD", TXTD)
            startActivity(intent)
        }
    }
}




