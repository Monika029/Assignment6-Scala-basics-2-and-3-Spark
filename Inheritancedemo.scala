package com.test

object Inheritancedemo {
  def main(args: Array[String]) {
   val vehicle1 = new Car(200)
    println(vehicle1.mph )
    vehicle1.race()
    
    val vehicle2 = new Bike(100)
    println(vehicle2.mph )
    vehicle2.race()
  }

}


