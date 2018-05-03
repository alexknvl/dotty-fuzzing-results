object I0 {
def I0[@specialized(Int) I1](i2: I1)(implicit I3: Int => I1): Unit = ()
val I3 = I0(23.asInstanceOf[Int])
}