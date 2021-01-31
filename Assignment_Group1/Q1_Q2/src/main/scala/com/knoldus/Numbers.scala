package com.knoldus

class Numbers extends NumberOperations {
    def divide(dividend: Float, divisor: Float): Float = {
      {
        dividend / divisor

      }
    }
     def fibonacci( number : Int) : Int = number match {
      case 0 | 1 => number
      case _ => fibonacci( number-1 ) + fibonacci( number-2 )
    }
}

