package com.scala.practice

object extractorDemo {
  def main(args: Array[String]) {
    println("Apply method : " + apply("Zara", "gmail.com"));
    println("Unapply method : " + unapply("Zara@gmail.com"));
    println("Unapply method : " + unapply("Zara Ali"));
  }

  def apply(arg1: String, arg2: String): String = {
    arg1 + "@" + arg2
  }

  def unapply(arg: String): Option[(String, String)] = {
    val parts = arg.split("@")

    if (parts.length == 2) {
      Some(parts(0), parts(1))
    } else {
      None
    }

  }
}