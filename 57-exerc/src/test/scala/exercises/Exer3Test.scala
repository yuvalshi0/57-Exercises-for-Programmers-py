package exercises 

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class Exer3Test extends FlatSpec with Matchers {
    "Inserting a simple quote" should "format it correctly" in {
        val quote = "test"
        val author = "test"
        
        assert(QuotePrinter.format(author, quote) == f"""$author says, "$quote"""")

    }
}
  
