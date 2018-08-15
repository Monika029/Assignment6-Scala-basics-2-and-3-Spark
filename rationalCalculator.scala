package com.test

object rationalCalculator {
  def main(args: Array[String]) {
     println("Enter four numbers where first two number represent numerator and denominator ot first number and the " +
         "other two number represent numerator and denominator of second number")
       val a= readInt()
       val b= readInt()
       val c= readInt()
       val d=readInt()
       val rat1 = new rationalNumber(a,b) 
       val rat2 = new rationalNumber(c,d)
  
     val add = rat1.+(rat2)
     println("Addition " + add)
     
     val sub = rat1.-(rat2)
     println("Subtraction " +sub)
     
     val mul= rat1.*(rat2)
     println("Multiplication " +mul)
     
     val div= rat1./(rat2)
     println("Division" +mul)
   }
}