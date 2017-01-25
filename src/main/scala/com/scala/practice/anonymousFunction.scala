package com.scala.practice

object anonymousFunction {
  def main(args: Array[String]) {
    var f1 = (x: Int) => x + 1
    var f2 = (x: Int, y: Int) => x + y
    var f3 = () => { System.getProperty("user.dir") }

    println("f1(4) : " + f1(4))
    println("f2(2,3) : " + f2(2, 3))
    println("f3() : " + f3())
  }
}