package com.scala.practice

object functionWithNamedArgument {
  def main(args: Array[String]) {
    println("sum(b = 10, a = 13) : " +sum(b = 10, a = 13))
  }
  
  def sum(a: Int, b: Int): Int = {
    println("a : " + a)
    println("b : " + b)
    a + b
  }
}