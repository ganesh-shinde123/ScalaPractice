package com.scala.practice

class Location(override val xc: Int, override val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z = zc
  
  def move(xc: Int, yc: Int, zc: Int) {
    move(xc, yc)
    z += zc
    println("z : " + z)
  }
}