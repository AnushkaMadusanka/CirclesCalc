package com.anushka.circles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radiusEditText = findViewById<EditText>(R.id.radiusEditText)
        val introTextView = findViewById<TextView>(R.id.introTextView)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val circlesCalc = CirclesCalc()

        //calculate circumference
        val circumButton = findViewById<Button>(R.id.circumferenceButton)
        circumButton.setOnClickListener{

            val input = radiusEditText.text.toString()
            val circumference = circlesCalc.getCircumference(input.toDouble())
            introTextView.text = getString(R.string.circumference_text)
            resultTextView.text = circumference.toString().plus(" cm")


        }

    }

}
