package chap13

import chap13.bobsdelights.{Fruit, Fruits}
import chap13.bobsdelights.Fruits.{Apple, Pear}

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 13---")
    def showFruit(fruit: Fruit) = {
      import fruit._
      println(name + "s are " +color)
    }

//    showFruit(Apple)
//    showFruit(Pear)

    for(fruit <- Fruits.menu){
      showFruit(fruit)
    }


  }

}
