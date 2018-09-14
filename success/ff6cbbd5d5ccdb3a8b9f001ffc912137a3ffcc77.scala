class I0 {
def I1[@specialized(Int) i2](): i2 = sys.error("")
}
object i2 {
val I1 = null.asInstanceOf[i2.type]
}