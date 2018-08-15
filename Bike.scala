package com.test

class Bike(speed:Int) extends Vehicle(speed){
  override val mph : Int=speed
  override def race() = println("Racing Bike")

}