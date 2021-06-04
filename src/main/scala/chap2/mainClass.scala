package chap2

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 2---")

    def max(x: Int, y: Int) = if (x > y) x else y

    println(max(3, 7))

    def greet() = println("Hello, How are you?")

    greet()
    println()

    // while loop
    var i = 0
    while (i < args.length) {
      if (i != 0)
        print(" ")
      print(args(i))
      i += 1
    }
    println()
  }
}
