package chap12

class Point(val x: Int, val y: Int)

class Rectangle (val topLeft: Point, val bottomRight: Point) extends Rectangular {
  // and many more geometric methods..
}

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}

