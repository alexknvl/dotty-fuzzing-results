class i0 {
def I1[@specialized(Int) I2](): I2 = sys.error("")
}
object I2 {
val I1 = null.asInstanceOf[I2.type]
}