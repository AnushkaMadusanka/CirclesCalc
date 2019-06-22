package com.anushka.circles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subject : String
        var marks : Int
        var average : Double = 76.8

        val distance : Long = 2341232345678L
        val temperature : Float = 456.67F

        val myChar : Char ='a'

        marks = 80
        subject = "Maths"
        



        Toast.makeText(applicationContext,"I got $marks for $subject . My Average was $average ",Toast.LENGTH_LONG).show()




    }
}
