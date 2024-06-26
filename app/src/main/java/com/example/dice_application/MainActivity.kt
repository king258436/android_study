package com.example.dice_application

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.dice_application.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImg1=binding.dice1
        val diceImg2=binding.dice2

        binding.diceStartBtn.setOnClickListener {
//            Toast.makeText(this, "주사위 Go!", Toast.LENGTH_SHORT).show()

            val num1 = Random.nextInt(1,6)
            val num2 = Random.nextInt(1,6)

            if(num1==1){
                diceImg1.setImageResource(R.drawable.dice_1)
            }
            else if(num1==2){
                diceImg1.setImageResource(R.drawable.dice_2)
            }
            else if(num1==3){
                diceImg1.setImageResource(R.drawable.dice_3)
            }
            else if(num1==4){
                diceImg1.setImageResource(R.drawable.dice_4)
            }
            else if(num1==5){
                diceImg1.setImageResource(R.drawable.dice_5)
            }
            else{
                diceImg1.setImageResource(R.drawable.dice_6)
            }

            if(num2==1){
                diceImg2.setImageResource(R.drawable.dice_1)
            }
            else if(num2==2){
                diceImg2.setImageResource(R.drawable.dice_2)
            }
            else if(num2==3){
                diceImg2.setImageResource(R.drawable.dice_3)
            }
            else if(num2==4){
                diceImg2.setImageResource(R.drawable.dice_4)
            }
            else if(num2==5){
                diceImg2.setImageResource(R.drawable.dice_5)
            }
            else if(num2==6){
                diceImg2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}