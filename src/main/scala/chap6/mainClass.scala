package chap6

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 6---")

    println(s"${new Rational(1, 2)}")
    val r = new Rational(2, 3)
    println(s"${r}, ${r.numer}, ${r.denom}")

    val s11 = new Rational(1, 2)
    val s22 = new Rational(2, 3)
    println(s"${s11}, ${s22}, ${s11 + s11 * s22}")

    println(s"${r * r}")

    implicit def intToRational(x: Int) = new Rational(x)

    val e1 = new Rational(2, 3)
    println(e1)
    println(2 * e1)
  }
}
