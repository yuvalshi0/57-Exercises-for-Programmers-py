package exercises.dto

class Item(val unitPrice: Int, val amount: Int) extends Tax {
  def price = unitPrice * amount
  def tax = price * rate
}

object Item {
  def apply(unitPrice: Int, amount: Int) = {
    new Item(unitPrice, amount)
  }
}
