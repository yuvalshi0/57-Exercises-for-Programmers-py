package exercises

import exercises.dto.Feet
import org.scalatest.FlatSpec
import org.scalatest.Matchers

class Exer7Test extends FlatSpec with Matchers {
    "to meter calculations" should "be correct" in {
        val num = Feet(1)

        assert(num.toMeter == 0.3048)
    }
    
    "feet multiplication" should "be correct" in {
        val num1 = Feet(3)
        val num2 = Feet(2)
        assert(num1*num2 == Feet(6))
    }
  
}
