trait I0 {
def I1(): Unit
}
trait I1 { I2: I1 =>
}
object I3 {
implicit def I4: I1 = ???
}
object I4 {
type I1 = String
}