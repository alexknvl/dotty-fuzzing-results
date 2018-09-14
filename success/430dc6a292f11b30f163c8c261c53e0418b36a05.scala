trait I0 {
def i1: Any
}
class I2 extends I0 {
val i1: I0 = ???
}