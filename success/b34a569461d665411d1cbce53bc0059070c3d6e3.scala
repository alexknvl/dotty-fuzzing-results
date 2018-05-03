trait i0 {
def i0(): Unit
}
trait i1 { i1: i0 =>
}
object I2 {
implicit def I2: i0 = ???
}
object I3 {
type i0 = String
}