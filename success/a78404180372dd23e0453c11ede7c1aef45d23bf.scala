object I0 {
def I0[@specialized(Int) i1](i2: i1)(implicit i3: Int => i1): Unit = ()
val I4 = I0(23.asInstanceOf[Int])
}