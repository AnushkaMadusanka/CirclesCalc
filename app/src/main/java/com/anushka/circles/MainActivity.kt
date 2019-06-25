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
        marks = 80
        subject = "Maths"

        Toast.makeText(applicationContext,getMessage(subject,marks,average),Toast.LENGTH_LONG).show()

    }

    private fun getMessage(mySubject : String, myMarks : Int, myAvg : Double) : String {

        return "I got $myMarks for $mySubject . My Average was $myAvg "
    }
}
