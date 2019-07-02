package com.anushka.circles

class CirclesCalc {
      private val pi = 3.14

      fun getCircumference(inputRadius : Double) : Double {

          return 2*pi*inputRadius

      }

      fun getArea(inputRadius: Double) : Double {

          return pi*inputRadius*inputRadius

      }

}