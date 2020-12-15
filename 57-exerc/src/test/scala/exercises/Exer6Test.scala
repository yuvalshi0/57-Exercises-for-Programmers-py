package exercises

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import java.time.LocalDate

class Exer6Test extends FlatSpec with Matchers {

  "inputting simple age" should "calculate the retirement age" in {
    val age = 40
    val retirementAge = 70
    val year = LocalDate.now.getYear
    assert(
      RetirementCalc.formatRetireString(age,retirementAge) == f"You have ${retirementAge - age} " +
        f"years left until you can retire. It's $year, so you can retire in ${year + retirementAge - age}"
    )
  }

  "inputting age bigger then retirementAge" should "print out you can retire" in {
    val age = 80
    val retirementAge = 70
    assert(RetirementCalc.formatRetireString(age,retirementAge)  == f"You can already retire!")
  }

}
