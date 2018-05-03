class I0 {
implicit def I1: I1 = ???
class I1 {
def I1(I2: Int, I3: Int = 1) = I2 match {
case I3 @ _ =>
I2
}
}
}