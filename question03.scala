package com.question03.scala

object question03 {
  def main(args:Array[String]):Unit={
    def normalHoursRate(n: Int): Int = 250 * n

    def otHourRate(ot: Int): Int = 85 * ot

    def netSal(n: Int, ot: Int): Int = normalHoursRate(n) + otHourRate(ot)

    def tax(ns: Int): Double = ns * 0.12

    def takeHomeSal(n: Int, ot: Int): Double = netSal(n, ot) - tax(netSal(n, ot))
    val n=40
    val ot=30
    val Salary = takeHomeSal(n,ot)
    println(s"A typical employees take home salary: $Salary")
  }
}
