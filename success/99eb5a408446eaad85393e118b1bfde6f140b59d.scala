object I0 {
def i1[@specialized(Int) I2](I2: I2)(implicit i3: Int => I2): Unit = ()
val i3 = i1(23.asInstanceOf[Int])
}