package com.scala.practice

object higherOrderFunction {
  def main(args: Array[String]) {
    println(apply(layout, 5))
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString + "]"
}