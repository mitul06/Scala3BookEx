package chap1

import java.math.BigInteger

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 1---")
    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital("France"))
    println(capital("US"))
    println()

    // factorial
    def factorial(x: BigInt): BigInt =
      if (x == 0) 1 else x * factorial(x - 1)

    println(factorial(5))

    def facto(x: BigInteger): BigInteger =
      if (x == BigInteger.ZERO) BigInteger.ONE else x.multiply(facto(x.subtract(BigInteger.ONE)))

    println(facto(BigInteger.valueOf(5)))

    println()
  }
}
