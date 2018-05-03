trait I0[+I0, +I1] { def apply(I0: I2): Unit }
class I2 extends I0[String] {
def I2: I0 = new I0[List] {}
val i3 = 1 ++ I2(I0)
def I4(I2: I0): I1 = i3
}
object i3 extends I2 {
def I2[I1] = 0
}