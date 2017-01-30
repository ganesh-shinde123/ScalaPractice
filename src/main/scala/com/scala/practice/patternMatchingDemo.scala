package com.scala.practice

object patternMatchingDemo {
  def main(args: Array[String]) {
    println(matchTest(1))
    println(matchTest(2))
    println(matchTest(3))

    println(matchTestAny(1))
    println(matchTestAny("two"))
    println(matchTestAny(3))
    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (person <- List(alice, bob, charlie)) {
      person match {
        case Person("Alice", 25) => println("Hi Alice!")
        case Person("Bob", 32) => println("Hi Bob!")
        case Person(name, age) => println(
          "Age: " + age + " year, name: " + name + "?")
      }
    }
  }
  case class Person(name: String, age: Int)

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 =>
      "Two"
    case _ =>
      "other"
  }

  def matchTestAny(x: Any): Any = x match {
    case 1 => 1
    case "two" => 2
    case _ => "Any"
  }
}