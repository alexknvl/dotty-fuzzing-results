trait I0 {
import I1.{ I1 =>
type I1 = I1
}
object I2 {
import I2._ import annotation.I2
val I2: I0.I1 = ???
}
class I2 {
val I1: I2.I1[String] = implicitly
override val I2: String = I2
def i3 = new I2
var i3 = new I2
val i3 = new I2
}