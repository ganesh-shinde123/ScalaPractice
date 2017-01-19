package com.scala.practice

object HelloWorld {
	def main(args: Array[String]) {
	  var i: String = "ASDF"
		println("Hello World\t" + i)
		
		val point = new Point(2, 2)
	  point.move(2, 2)
	  
	  val location = new Location(0, 0, 0)
	  location.move(1, 1, 1)
	}
}
