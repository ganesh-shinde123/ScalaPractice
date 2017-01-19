package com.scala.practice

object Demo {
  var myDemoVar1: Int = 100
  val myDemoVal1 = 200
  var myDemoVar2: String = "asdfghjk"
  val myDemoVal2 = "qwertyui"

  var myVar1: Int = 101
  val myVal1 = 201
  var myVar2: String = "asdf1"
  val myVal2 = "qwer1"

  def main(stringArgsArray: Array[String]) {
    var myVar1: Int = 10
    val myVal1 = 20
    var myVar2: String = "asdf"
    val myVal2 = "qwer"

    println("Demo.myVar1 : " + Demo.myVar1); println("Demo.myVar2 : " + Demo.myVar2)
    println("Demo.myVal1 : " + Demo.myVal1); println("Demo.myVal2 : " + Demo.myVal2)

    println("myVar1 : " + myVar1); println("myVar2 : " + myVar2)
    println("myVal1 : " + myVal1); println("myVal2 : " + myVal2)

    println("myDemoVar1 : " + myDemoVar1); println("myDemoVar2 : " + myDemoVar2)
    println("myDemoVal1 : " + myDemoVal1); println("myDemoVal2 : " + myDemoVal2)
  }
}