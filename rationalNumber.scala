package com.test

class rationalNumber(n: Int, d: Int) {
  
     require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numer = n / g
    val denom = d / g
  
    def + (that: rationalNumber): rationalNumber =
      new rationalNumber(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )
   
     def + (i: Int): rationalNumber = {
    new rationalNumber(numer + i * denom, denom)
    }

      def - (that: rationalNumber): rationalNumber =
      new rationalNumber(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )

    def - (i: Int):rationalNumber =
      new rationalNumber(numer - i * denom, denom)

    def * (that: rationalNumber): rationalNumber =
      new rationalNumber(numer * that.numer, denom * that.denom)

    def * (i: Int):rationalNumber=
      new rationalNumber(numer * i, denom)

    def / (that: rationalNumber): rationalNumber =
      new rationalNumber(numer * that.denom, denom * that.numer)

    def / (i: Int): rationalNumber =
      new rationalNumber(numer, denom * i)

    override def toString = numer +"/"+ denom

     def gcd(a: Int, b: Int): Int = 
      if (b == 0) a else gcd(b, a % b)
  
  
}