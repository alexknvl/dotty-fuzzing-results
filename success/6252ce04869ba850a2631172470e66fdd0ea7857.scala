trait i0 {
def i0(): Unit
}
trait i1 { i1: i0 =>
}
object i2 {
implicit def i3: i0 = ???
}
object I4 {
type i0 = String
}