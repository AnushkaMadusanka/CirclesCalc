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
        circumButton.setOnClickListener {

            if(radiusEditText.text.toString().isEmpty()){

                Toast.makeText(this,"Empty radius",Toast.LENGTH_LONG).show()
            } else {

                val input = radiusEditText.text.toString()
                val circumference = circlesCalc.getCircumference(input.toDouble())
                introTextView.text = getString(R.string.circumference_text)
                resultTextView.text = circumference.toString().plus(" cm")

            }
        }
            //calculate area
            val areaButton = findViewById<Button>(R.id.areaButton)
            areaButton.setOnClickListener {
                if(radiusEditText.text.toString().isEmpty()){

                    Toast.makeText(this,"Empty radius",Toast.LENGTH_LONG).show()
                } else {

                    val input = radiusEditText.text.toString()
                    val area = circlesCalc.getArea(input.toDouble())
                    introTextView.text = getString(R.string.area_text)
                    resultTextView.text = area.toString().plus(" cm\u00B2")
                }

            }

        }

    }
