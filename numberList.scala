package com.test

object numberList {
  def main(args:Array[String]){
    
    val listOfNumbers=List(1,2,3,4,5,6,7,8,9,10)
    val sum = listOfNumbers.sum
    println("sum of all the numbers = "+sum)
    println("Total number of elements present in the list = "+listOfNumbers.length)
    println("Average of the numbers present in the list = "+sum/listOfNumbers.length)
    val sumOfEven= listOfNumbers.filter((x:Int)=>x%2==0)
    println("even numbers = "+sumOfEven)
    println("Sum of all the even numbers = "+ sumOfEven.sum)
    val divideby5and3 = listOfNumbers.filter((x:Int)=> x % 5 == 0 || x % 3 == 0)
    println("the numbers divisible by both 5 and 3 = "+divideby5and3)
    println("The total number of elements in the list which are divisible by 5 and 3 = "+divideby5and3.length)
    
  }
}


