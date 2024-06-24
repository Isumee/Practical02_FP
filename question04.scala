package com.question04.scala

object question04 {
  def main(args:Array[String]):Unit={
    def noAttendees(ticketPrice:Int):Int= 120+(15-ticketPrice)/5*20
    def revenue(ticketPrice:Int):Int=noAttendees(ticketPrice)*ticketPrice
    def cost(ticketPrice:Int):Int=500+3*noAttendees(ticketPrice)
    def profit(ticketPrice:Int):Int=revenue(ticketPrice)-cost(ticketPrice)
    var tp = 15
    var n=noAttendees(tp)
    val profit1 = profit(tp)
    println(s"The profit gained for the ticket price Rs.15 is $profit1")
    println(f"No. of attendees: "+n)
    tp = 10
    n=noAttendees(tp)
    val profit2 = profit(tp)
    println(s"The profit gained for the ticket price Rs.10 is $profit2")
    println(f"No. of attendees: "+n)
    tp = 20
    n=noAttendees(tp)
    val profit3 = profit(tp)
    println(s"The profit gained for the ticket price Rs.20 is $profit3")
    println(f"No. of attendees: "+n)
  }
}
