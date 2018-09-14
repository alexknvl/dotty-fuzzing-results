class I0 {
def I0[@specialized(Int) i1](): i1 = sys.error("")
}
object i1 {
val I0 = null.asInstanceOf[i1.type]
}