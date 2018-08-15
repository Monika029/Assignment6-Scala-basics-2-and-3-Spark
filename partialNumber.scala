package com.test

object partialNumber {
  def main(args:Array[String])
    {
       def squareRoot( p : Int , q : Int, r : Int, f: (Int,Int,Int) => Int  ): Unit=
      {
   println("square : " +(f(p,q,r) * f (p,q,r)))
    
      }
      
       def addPartial(a : Int , b :Int, c:Int) : Int =
        (    
            a + b + c   
          )
		   val a = addPartial(5, 2, 6)
		   println("Sum: " +a)
		
       val b = addPartial(_: Int, _: Int, 7)  //PartialFunction
       val sum = b(9,3)
       println("Sum_Partial1: " +sum)
    
       val c = addPartial _                   //PartialFunction
       val sum2 = c(15,13,20)
       println("Sum_Partial2: " + sum2)
       
       squareRoot(7,7,20,addPartial) 
      
    }  
}
