abstract class i0 {
def I1: i3;
}
abstract class i3() {
val I4: Int = 1
}
object I4 {
implicit def i5(i5: I1) = i5
@inline def apply(i5: String) = apply()
}
class i5 extends i0 {
def i2(I4: I4): i5 = null
}
object I1 {
import I4.{ I1 => }
}
}