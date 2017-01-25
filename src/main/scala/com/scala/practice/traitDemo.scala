package com.scala.practice

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class MyPoint(val xc: Int, val yc: Int) extends Equal {
  val x = xc
  val y = yc

  def isEqual(obj: Any) = obj.isInstanceOf[MyPoint] && obj.asInstanceOf[MyPoint].x == y
}

object traitDemo {
  def main(args: Array[String]) {
    val p1 = new MyPoint(2, 3)
    val p2 = new MyPoint(2, 4)
    val p3 = new MyPoint(3, 3)

    println(p1.isNotEqual(p2))
    println(p1.isNotEqual(p3))
    println(p1.isNotEqual(2))

    val p = new Point(1, 2)
    val l = new Location(1, 2, 3)
    
    println("p.isInstanceOf[Point] : " + p.isInstanceOf[Point])
    println("l.isInstanceOf[Point] : " + l.isInstanceOf[Point])
    
     println("p.asInstanceOf[Point] : " + p.asInstanceOf[Point])
    println("l.asInstanceOf[Point] : " + l.asInstanceOf[Point])
  }
}