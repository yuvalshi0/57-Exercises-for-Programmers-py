package exercises.dto

class Feet(val num: Int) {
    val RATE = 0.09290304
    def toMeter(): Double = math.sqrt(num*num*RATE)

    def *(that: Feet) = new Feet(this.num * that.num)
    def ==(that:Feet) = this.num == that.num

    override def toString = f"$num"
}


object Feet {
    def apply(num: Int): Feet  = {
        new Feet(num)
    }
}
