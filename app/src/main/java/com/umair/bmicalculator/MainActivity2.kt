package com.umair.bmicalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn.setOnClickListener() {

            val h = txtHeight.text.toString().toFloat() / 100
            val w = txtWeight.text.toString().toFloat()

            val res = w/(h*h)


            if (res < 18.5) {
                txtRes.text = "You are underweight"
        }
            else if (res in 18.5..24.9 ) {
                    txtRes.text = "You are okay"
                }
            else if (res in 25.0..29.9 ) {
                txtRes.text = "You are overweight"
            }
            else {
                txtRes.text = "You are very overweight"
            }

    }
}
}