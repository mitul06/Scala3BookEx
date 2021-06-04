package chap13

package object bobsdelights {
  def showFruits(fruit: Fruit) = {
    import fruit._
    println(name + "s are with color" + color)
  }
}

