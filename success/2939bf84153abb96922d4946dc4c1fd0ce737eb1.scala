class I0 {
implicit def I0: I1 = ???
class I1 {
def I2(i3: Int, I4: Int = 1) = i3 match {
case I4 @ _ =>
i3
}
}
}