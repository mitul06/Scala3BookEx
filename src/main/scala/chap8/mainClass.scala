package chap8

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 8---")
    var increas = (x: Int) => x + 1;
    println(increas(10))

    println()
    val someNumbers = List(-11, -10, -5, 0, 5, 10)
    someNumbers.foreach((x: Int) => println(x))

    println()
    someNumbers.filter((x: Int) => x > 0).foreach(println);
    println()

    //placeholder
    someNumbers.filter(_ > 0).foreach(println)

    println()

    def sum11(a: Int, b: Int, c: Int) = a + b + c

    println(sum11(1, 2, 3))

    val s34 = sum11 _
    println(s34(3, 4, 5))
    println(s34.apply(1, 2, 3))

    def speed(distance: Float, time: Float): Float =
      distance / time

    println(speed(100, 10))

    //    def printTime(out: java.io.PrintStream = Console.out) =
    //      out.println("time = " + System.currentTimeMillis())
    //
    //    println(printTime(out = Console.err))
    //
    //    def printTime2(out: java.io.PrintStream = Console.out,
    //                   divisor: Int = 1) =
    //      out.println("time = " + System.currentTimeMillis() / divisor)
    //
    //    println(printTime2(divisor = 1000))

    println()

    //    def boom(x: Int): Int = if (x == 0) throw new Exception("boom!") else boom(x - 1) + 1
    //    println(boom(5))


    LongLines.processFile("src/main/scala/chap8/hello.txt", 5)

  }
}
