package com.scala.practice

object forLoop {
  def main(args: Array[String]) {
    for (i <- 1 to 5) {
      println("i : " + i)
    }
    println("---------------------------------------")
    for (i <- 6 until 11) {
      println("i : " + i)
    }
    println("---------------------------------------")
    for (i <- 0 to 5; j <- 0 until 3) {
      println("i : " + i + "\tj : " + j)
    }
    println("---------------------------------------")
    val list = List(1, 2, 3, 4, 5)
    for (i <- list) {
      println("i : " + i)
    }
    println("---------------------------------------")
    for (i <- list; if i == 3; if i < 5) {
      println("i : " + i)
    }

  }
}