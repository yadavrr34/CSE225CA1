package com.example.earningethics

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.*

class SERVICES : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)
        val rb1: RatingBar = findViewById(R.id.r1)
        val rb2: RatingBar = findViewById(R.id.r2)
        val rb3: RatingBar = findViewById(R.id.r3)
        var txt = findViewById<TextView>(R.id.average)
        val subBtn: Button = findViewById(R.id.btn2)

        subBtn.setOnClickListener() {


            var r1 = rb1.rating
            var r2 = rb2.rating
            var r3 = rb3.rating


            var avg = (r1 + r2 + r3) / 3




            when (avg.toInt()) {
                5 -> {
                    txt.setText("best")
                }

                4 -> {
                    txt.setText("good")
                }
                3 -> {
                    txt.setText("average")
                }
                2 -> {
                    txt.setText("bad")
                }
                else ->
                    txt.setText("worst")
            }
            val vg: ViewGroup? = findViewById(R.id.custom_toast)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.custom_toast_layout,vg)

            val tv = layout.findViewById<TextView>(R.id.txtVw)
            tv.text ="Average Rating Result=="+"best"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.BOTTOM, 30 , 100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()
        }
    }}