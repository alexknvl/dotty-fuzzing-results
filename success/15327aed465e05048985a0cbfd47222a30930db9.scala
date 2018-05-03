class I0 {
implicit def I1: I2 = ???
class I2 {
def I3(I3: Int, I4: Int = 1) = I3 match {
case I4 @ _ =>
I3
}
}
}