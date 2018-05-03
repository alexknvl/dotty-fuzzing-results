trait I0 {
def I1(): Unit
}
trait I1 { i2: I1 =>
}
object I3 {
implicit def i4: I1 = ???
}
object i5 {
type I1 = String
}