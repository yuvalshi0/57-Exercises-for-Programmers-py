package exercises

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class Exer2Test extends FlatSpec with Matchers {
  "Hello World" should "print 11" in {
    val str = "Hello World"
    val out = CountChars.formatOut(str)
    assert(out.toString == f"$str has 11 characters.")
  }
}
