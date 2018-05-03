object I0 {
def I0[@specialized(Int) i1](i1: i1)(implicit i2: Int => i1): Unit = ()
val i2 = I0(23.asInstanceOf[Int])
}