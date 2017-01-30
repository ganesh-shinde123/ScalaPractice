package com.scala.practice

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object exceptionHandling {
  def main(args: Array[String]) {
    try {
      val fileReader = new FileReader("input.txt");
    } catch {
      case ex: FileNotFoundException => {
        println("FileNotFoundException")
        ex.printStackTrace()
      }
      case ex: IOException => {
        println("FileNotFoundException")
        ex.printStackTrace()
      }
    } finally {
      println("finally")
    }
  }
}