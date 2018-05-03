class i0 {
implicit def i1: i2 = ???
class i2 {
def i2(I3: Int, I4: Int = 1) = I3 match {
case I4 @ _ =>
I3
}
}
}