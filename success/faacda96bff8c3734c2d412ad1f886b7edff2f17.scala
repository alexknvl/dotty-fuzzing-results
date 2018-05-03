trait i0 {
def I1(): Unit
}
trait I1 { I2: I1 =>
}
object i3 {
implicit def i4: I1 = ???
}
object i5 {
type I1 = String
}