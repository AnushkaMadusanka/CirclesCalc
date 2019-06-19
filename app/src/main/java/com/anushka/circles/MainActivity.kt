package com.anushka.circles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val subject = "Maths"
//        var marks = 80
//        var average = 76.8
//
//        Toast.makeText(applicationContext,"I got $marks for $subject . My Average was $average ",Toast.LENGTH_LONG).show()

        val name = "Anushka"
        var distance = 8

        Toast.makeText(applicationContext," $name ran $distance kilometers today", Toast.LENGTH_LONG).show()



    }
}
