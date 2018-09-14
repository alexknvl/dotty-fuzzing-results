class i0 {
def i1[@specialized(Int) I2](): I2 = sys.error("")
}
object I2 {
val i1 = null.asInstanceOf[I2.type]
}