package chap12

object mainClass {
  def main(args: Array[String]): Unit = {
    println("---Book Chap 12---")

    val frog = new Frog
    frog.philosophize()
    val phil: Philosophical = frog
    println(phil)
    phil.philosophize()

    val phrog: Philosophical = new Frog
    phrog.philosophize()


    println()
    val rect = new Rectangle(new Point(1, 1), new Point(10, 10))
    println(rect.left)
    println(rect.right)
    println(rect.width)


    println()
    val queue = new BasicIntQueue
    queue.put(10)
    queue.put(20)
    queue.put(30)
    println(queue.get())
    println(queue.get())
    println(queue.get())

    println()
    val queue1 = new MyQueue
    queue1.put(10)
    println(queue1.get())

    println()
    val queue2 = new BasicIntQueue with Doubling
    queue2.put(10)
    println(queue2.get())

    println()
    val queue3 = (new BasicIntQueue
      with Incrementing with Filtering)
    queue3.put(-1); queue3.put(0); queue3.put(1)

    println(queue3.get())
    println(queue3.get())
    println()
  }

}
