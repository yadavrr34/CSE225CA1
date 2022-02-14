package com.example.earningethics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        val aboutus=findViewById<Button>(R.id.aboutus)
        val joinus=findViewById<Button>(R.id.joinusbtn)
        val samples=findViewById<Button>(R.id.sample)
        val services=findViewById<Button>(R.id.servicebtn)

        val pgsBar1 = findViewById<ProgressBar>(R.id.pBarCircular)
        pgsBar1.visibility = View.INVISIBLE

        // *************************jumping to the activity*****************************

        joinus.setOnClickListener {
            val intent=Intent(this,JOINUS::class.java)
            startActivity(intent)
            pgsBar1.visibility = View.VISIBLE
            i= pgsBar1.progress
            Thread{
                while(i<300){
                    i = i+1
                    Handler(Looper.getMainLooper()).post {
                        pgsBar1.progress = i
                        if (i ==300) {
                            pgsBar1.visibility = View.INVISIBLE
                        }
                    }
                    try {
                        Thread.sleep(300)
                    }
                    catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }.start()
        }
        services.setOnClickListener {


            val intent=Intent(this,SERVICES::class.java)
            startActivity(intent)



        }
        aboutus.setOnClickListener {


            val intent=Intent(this,AboutUs::class.java)
            startActivity(intent)



        }

        //******************************************end of jumping activity******************************************

    }
    //*********************************start menu code****************************************************************



    //******************************************************* END OF MENU CODE***********************************************

}