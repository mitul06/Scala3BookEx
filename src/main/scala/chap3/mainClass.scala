package chap3

import scala.collection.immutable.HashSet
import scala.collection.mutable

object mainClass {

  def main(args: Array[String]): Unit = {
    println("---Book Chap 3---")
    val greetStrings = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = " , "
    greetStrings(2) = "World"

    for (i <- 0 to 2) {
      print(greetStrings(i))
    }


    println()
    // tuples
    val pair = (99, "Luft")
    println(pair._1)
    println(pair._2)

    //map
    var jetset = Set("Boeing", "Airbus")
    jetset += "Lear"
    println(jetset.contains("cessna"))
    println(jetset.contains("Airbus"))

    //set mutable
    val mutSet = mutable.Set("Mitul", "Paras")
    mutSet += "Sagar"
    println(mutSet)


    //hashset
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")

    //mutable
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")

    println(treasureMap(2))
    println(treasureMap)

    // map
    val romanNumbers = Map(
      1 -> "I", 2 -> "II", 3 -> "III"
    )

    println(romanNumbers(2))

    //assert
    def formatArgs(args: Array[String]) = args.mkString("\n")

    println(formatArgs(args))
    val res = formatArgs(Array("zero", "one", "two"))
    assert(res == "zero\none\ntwo")

  }
}
