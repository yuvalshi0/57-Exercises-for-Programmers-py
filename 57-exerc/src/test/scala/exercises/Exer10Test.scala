package exercises

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import exercises.dto.Item
import exercises.dto.Tax

class Exer10Test extends FlatSpec with Matchers {
  "new Item" should "calculate the item price" in {
    val price = 5
    val amount = 2
    val item = Item(5, 2)
    assert(item.price == 10)
  }

  "new Item" should "calculate the item tax" in {
    val price = 5
    val amount = 2
    val tax = Item(1,1).tax
    val item = Item(5, 2)
    assert(item.tax == price * amount * tax)
  }

  "entering some items" should "calculate the items total " in {
    val item1 = Item(1, 1)
    val item2 = Item(2, 2)
    val item3 = Item(3, 3)

    val itemList = List(item1, item2, item3)
    val total = 1 * 1 + 2 * 2 + 3 * 3

    assert(Checkout.total(itemList) == total)
  }

  "entering some items" should "calculate the items tax " in {
    val item1 = Item(1, 1)
    val item2 = Item(2, 2)
    val item3 = Item(3, 3)

    val itemList = List(item1, item2, item3)
    val rate = Item(1,1).tax
    val totalTax = 1 * 1 * rate + 2 * 2 * rate + 3 * 3 * rate

    assert(Checkout.tax(itemList) == totalTax)
  }
}
