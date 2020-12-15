package exercises

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class Exer9Test extends FlatSpec with Matchers {
  "inserting size lower then 350" should "print 1 gallon" in {
    val width = 10
    val height = 10

    assert(GallonCalc.amount(width, height) == 1)
  }

  "inserting size higher then 350" should "print 2 gallon" in {
    val width = 351
    val height = 3

    assert(GallonCalc.amount(width, height) == 4)
  }
}
