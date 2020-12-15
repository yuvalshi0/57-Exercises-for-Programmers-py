package exercises
import exercises.dto.Item
import scala.collection.mutable.ArrayBuffer

object Checkout extends App {

  println("Enter amount of items")
  val amount = readInt()
  val itemsList = ArrayBuffer[Item]()
  for (i <- 1 to amount) {
    println(f"Enter the price of item $i")
    val price = readInt()
    println(f"Enter the quantity of item $i:")
    val amount = readInt()
    itemsList += Item(price, amount)

  }
  val totalPrice = total(itemsList.toList)
  val totalTax = tax(itemsList.toList)
  println(f"Total price: $totalPrice")
  println(f"Total tax: $totalTax")
  println(f"Total: ${totalPrice + totalTax}")

  def total(items: List[Item]) = {
    items.foldLeft(0)((total, item) => total + item.price)
  }

  def tax(items: List[Item]) = {
    items.foldLeft(0d)((total, item) => total + item.tax)
  }

}
