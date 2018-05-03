trait I0[+I1]
case class I1(i2: I1) extends I0()
class I3() extends I0[I1]