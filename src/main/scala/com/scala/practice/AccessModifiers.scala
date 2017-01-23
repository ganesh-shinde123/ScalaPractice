package com.scala.practice

class AccessModifiers {
  class Outer {
    class Inner {
      private val x = 0;

      def print() {
        println("x : " + x)
      }

      private def privatePrint() {
        println("x : " + x)
      }
    }
    //println(x) // error
    print()
    //privatePrint() // error

  }

}

package p {
  class Super {
    protected def f() {
      println("super")
    }

    private def privateF() {
      println("super")
    }
  }

  class Sub extends Super {
    f()
    //privateF() // error
  }

  class Other {
    // (new Super()).f() // error
    // (new Sub()).f() // error
  }
}

package Outer {
  package Inner {
    class MyClass {
      private[Outer] val x = "Outer private"
      private[Inner] val y = "Inner private"
      private[this] val z = "Implicit object private"

      def f() {
        println("x : " + x)
        println("y : " + y)
        println("z : " + z)
      }
      def f(myClass: MyClass) {
        println("x : " + myClass.x)
        println("y : " + myClass.y)
        //println("z : " + myClass.z) //error
      }
    }
    class OtherClass {
      def f() {
        val myClass = new MyClass()
        println("x : " + myClass.x)
        println("y : " + myClass.y)
        //println("z : " + myClass.z) //error
      }

      def f(myClass: MyClass) {
        println("x : " + myClass.x)
        println("y : " + myClass.y)
        //println("z : " + myClass.z) //error
      }
    }
  }

  import Inner._
  class OuterClass {
    def f() {
      val myClass = new MyClass()
      println("x : " + myClass.x)
      //println("y : " + myClass.y) //error
      //println("z : " + myClass.z) //error
    }

    def f(myClass: MyClass) {
      println("x : " + myClass.x)
      //println("y : " + myClass.y) //error
      //println("z : " + myClass.z) //error
    }
  }
}



