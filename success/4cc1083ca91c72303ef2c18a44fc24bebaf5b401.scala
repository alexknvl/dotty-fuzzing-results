class I0 {
private def I0: Int = 1
}
class I1(I0: Int) extends I0() {
val i2 = new I0() {}
}