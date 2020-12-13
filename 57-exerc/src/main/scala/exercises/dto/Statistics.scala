package exercises.dto

final case class Statistics(val firstNumber: Int, val secondNumber: Int) {
    require(secondNumber > 0, "second number cannot zero")

    val sum = firstNumber + secondNumber
    val diff = firstNumber - secondNumber
    val product = firstNumber * secondNumber
    val quotient = if(secondNumber == 0) 0 else firstNumber / secondNumber

    override def toString(): String = f"""
    $firstNumber + $secondNumber = $sum\n
    $firstNumber - $secondNumber = $diff\n
    $firstNumber * $secondNumber = $product\n
    $firstNumber / $secondNumber = $quotient\n
    """
}