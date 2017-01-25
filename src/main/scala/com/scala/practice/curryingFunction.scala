package com.scala.practice

object curryingFunction {
  def main(args: Array[String]) {
    println(concatenate("Ganesh")("Shinde"))
    println(strcat("Ganesh")("Shinde"))
  }
  
  def concatenate(str1: String)(str2: String)  =  {
    str1 + " " + str2
  }
  
  def strcat(s1: String) = (s2: String) => s1 + " " + s2
  
}