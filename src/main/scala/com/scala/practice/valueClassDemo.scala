package com.scala.practice

trait Printable extends Any {
  def print(): Unit = println(this)
}

class Wrapper(val underlying: Int) extends AnyVal with Printable

object valueClassDemo {
  def main(args: Array[String]) {
    val wrapper = new Wrapper(5)
    wrapper.print()
  }
}