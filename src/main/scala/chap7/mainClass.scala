package chap7

object mainClass {

  def main(args: Array[String]): Unit = {

    println("---Book Chap 7---")

    def gcdLoop(x: Long, y: Long): Long = {
      var a = x
      var b = y
      while (a != 0) {
        val temp = a
        a = b % a
        b = temp
      }
      b
    }

    println(gcdLoop(3, 5))

    def gcd(x: Long, y: Long): Long = if (y == 0) x else gcd(y, x % y)

    println(gcd(3, 5))

    //for loop
    for (e <- 1 to 5) println("e is " + e)
    println()
    for (i <- 1 until 5) println("i is " + i)

    //match expression
    val firstArg = if (!args.isEmpty) args(0) else ""
    val friend =
      firstArg match {
        case "salt" => println("pepper")
        case "chips" => println("salsa")
        case "eggs" => println("bacon")
        case _ => println("Huh?")
      }

    println(friend)

    println()

  }
}
