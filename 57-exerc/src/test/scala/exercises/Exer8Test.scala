package exercises

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class Exer8Test extends FlatSpec with Matchers {

  "inserting an odd number" should "divide the pizza with leftover" in {
    val numPizzas = 2
    val numPeople = 3
    val numberSlice = 8
    assert(PizzaDivider.divide(numPizzas, numberSlice, numPeople) == (5, 1))
  }

  "inserting an even number" should "divide the pizza with leftover" in {
    val numPizzas = 2
    val numPeople = 2
    val numberSlice = 8
    assert(PizzaDivider.divide(numPizzas, numberSlice, numPeople) == (8, 0))
  }
}
