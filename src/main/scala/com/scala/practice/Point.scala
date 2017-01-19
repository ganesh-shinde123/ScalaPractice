package com.scala.practice

class Point(val xc: Int, val yc: Int) {
  var x = xc
  var y = yc
  
  def move(xm: Int, ym: Int) {
    x += xm
    y += ym
    println("x : " + x)
    println("y : " + y)
  }
  
}

object Point {
  def main(args: Array[String]) {
    val point = new Point(0,0)
    point.move(1, 1)
  }
}