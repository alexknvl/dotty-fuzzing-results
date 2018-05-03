trait I0 {
def I0(): Unit
}
trait i1 { i2: I0 =>
}
object i2 {
implicit def i3: I0 = ???
}
object i3 {
type I0 = String
}