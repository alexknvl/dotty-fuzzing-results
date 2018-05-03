object I0 {
def I1[@specialized(Int) i2](i2: i2)(implicit i3: Int => i2): Unit = ()
val i4 = I1(23.asInstanceOf[Int])
}