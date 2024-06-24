package com.question02.scala

object question02 {
  def main(args:Array[String]):Unit={
    var a=2
    var b=3
    var c=4
    var d=5
    var k=4.3f
    var g=4.0f //I assumed  g is equal to the value of the first question
    b-=1
    d-=1
    println(f"--b * a + c * d-- = "+(b*a+c*d))
    println(f"a++")
    a += 1
    println(f"a = "+a)
    println(f"-2 * (g -k) + c = "+(-2*(g-k)+c))
    println(f"c = c++")
    c+=1
    println(f"c = "+c)
    c+=1
    println(f"c = ++c*a++ --> "+(c*a))
    a+=1
    println(f"c = ++c*a++ --> "+(c*a))
  }
}
