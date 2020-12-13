package exercises

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import java.io.StringReader
import java.io.PrintStream
import java.io.ByteArrayOutputStream

class Exer1Test extends FlatSpec with Matchers {

  "Saying Hello with name" should "print out my name" in {
    val name = "yuval"
    val out = Hello.formatHello(name)
    assert(out.toString == "Hello, yuval, nice to meet you!")
  }
}
