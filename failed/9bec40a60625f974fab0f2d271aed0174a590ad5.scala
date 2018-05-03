abstract class i0 {
def I1: I2;
}
abstract class I2() {
val I2: Int = 1
}
object i3 {
implicit def I4(I4: I1) = I4
@inline def apply(I4: String) = apply()
}
class I4 extends i0 {
def I2(I2: i3): I4 = null
}
object I1 {
import I2.{ I1 => }
}
}