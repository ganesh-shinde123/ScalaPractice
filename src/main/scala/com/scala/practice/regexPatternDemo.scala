package com.scala.practice

import scala.util.matching.Regex

object regexPatternDemo {
  def main(args: Array[String]) {
    val pattern = "Scala".r
    val str = "Scala is a nice language. scala is a simple Language"
    println((pattern findAllIn str).mkString(","))
    
    val myPattern = new Regex("(s|S)cala")
     println((myPattern findAllIn str).mkString(","))
     
     val myPatern1 = new Regex("[lL]anguage")
    println((myPatern1 findAllIn str).mkString(","))
  }
}