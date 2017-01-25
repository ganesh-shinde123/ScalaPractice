package com.scala.practice

import java.util.Date

object partiallyAppliedFunction {
  def main(args: Array[String]) {
    var date = new Date()
    log(date, "message1")

    var logBoundDate = log(date, _: String)

    logBoundDate("message2")
  }

  def log(date: Date, message: String) {
    println(date + " " + message)
  }
}