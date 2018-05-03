trait i0 {
def I1(): Unit
}
trait I1 { I1: I1 =>
}
object i2 {
implicit def i3: I1 = ???
}
object I4 {
type I1 = String
}