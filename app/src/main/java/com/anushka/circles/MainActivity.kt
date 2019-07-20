package com.anushka.circles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circlesCalc = CirclesCalc()

        circumferenceButton.setOnClickListener {
            if (radiusEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Empty radius", Toast.LENGTH_LONG).show()
            } else {
                val input = radiusEditText.text.toString()
                val circumference = circlesCalc.getCircumference(input.toDouble())
                introTextView.text = getString(R.string.circumference_text)
                resultTextView.text = circumference.toString().plus(" cm")
            }
        }

        areaButton.setOnClickListener {
            if (radiusEditText.text.toString().isEmpty()) {
                Toast.makeText(this, "Empty radius", Toast.LENGTH_LONG).show()
            } else {
                val input = radiusEditText.text.toString()
                val area = circlesCalc.getArea(input.toDouble())
                introTextView.text = getString(R.string.area_text)
                resultTextView.text = area.toString().plus(" cm\u00B2")
            }
        }
    }
}
