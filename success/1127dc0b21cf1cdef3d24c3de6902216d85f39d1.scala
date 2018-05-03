trait i0 {
def i0(): Unit
}
trait I1 { I1: i0 =>
}
object I1 {
implicit def i2: i0 = ???
}
object i3 {
type i0 = String
}