package chap5

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 5---")

    val sim = 'aSymbol
    println(sim.name)

    // String interpolation
    println(s"The answer is ${4 * 3}")
    println(s"The PI approximately value is ${math.Pi}")

    //operator
    val sum = 1 + 2;
    println(sum)
    val sum1 = 1.+(2);
    println(sum1)
    val sum2 = 1.+(2L);
    println(sum2)
    val s1 = "Hello";
    println(s1 indexOf 'o')
    println(s"${'b' - 'a'}")
    println(s"${~1}")

    val toBe = true;
    println(s"${toBe || !toBe}")
    val toBe1 = true;
    println(s"${toBe1 && !toBe1}")
    println()

  }
}
