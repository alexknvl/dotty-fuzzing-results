object I0 {
def i1[@specialized(Int) i1](I2: i1)(implicit I3: Int => i1): Unit = ()
val I3 = i1(23.asInstanceOf[Int])
}