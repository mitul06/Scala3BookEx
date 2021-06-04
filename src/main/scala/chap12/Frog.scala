package chap12

class Frog extends Animal with Philosophical with HasLegs {
  override def toString: String = "Green"
  override def philosophize() = {
    println("It ain't easy being " + toString + "!!!!!")
  }
}

trait Philosophical {
  def philosophize() = {
    println("I consume memory, therefore i am!")
  }
}


class Animal
trait HasLegs