package exercises

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import exercises.dto.Statistics

class Exer5Test extends FlatSpec with Matchers {

  "inserting two simple numbers" should "print out the correct statistics" in {
    val firstNumber = 10
    val secondNumber = 5

    val stats = Statistics(firstNumber, secondNumber)
    val statisticsString: String = f"""
    $firstNumber + $secondNumber = ${firstNumber + secondNumber}\n
    $firstNumber - $secondNumber = ${firstNumber - secondNumber}\n
    $firstNumber * $secondNumber = ${firstNumber * secondNumber}\n
    $firstNumber / $secondNumber = ${firstNumber / secondNumber}\n
    """

    assert(stats.toString().trim == statisticsString.trim)
  }

  the[IllegalArgumentException] thrownBy {
    Statistics(5, 0)
  } should have message "requirement failed: second number cannot zero"
}
