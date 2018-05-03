class I0 {
def i1: String = null
implicit def i2(i2: String): Unit = println(i1.getClass)
}