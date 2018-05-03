trait I0[+I0, +I1] { def apply(I0: I1): Unit }
class I1 extends I0[String] {
def I1: I0 = new I0[List] {}
val i2 = 1 ++ I1(I0)
def i3(I1: I0): I1 = i2
}
object i2 extends I1 {
def I1[I1] = 0
}