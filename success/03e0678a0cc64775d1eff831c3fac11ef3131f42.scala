class I0 {
def I0[@specialized(Int) i1](): i1 = sys.error("")
}
object I2 {
val I0 = null.asInstanceOf[I2.type]
}