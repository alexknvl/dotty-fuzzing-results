class I0 {
private[I0] def I0: Int = 0
}
object I0 {
def I1[I1 <: I0](i2: I1): I1 = sys.error("")
}
import I0.{ i3 =>
class I4
}
object I5{
class I5[@specialized i2, Option I0, I1](i2: I0[I0, I1]) extends I0(Array[I1]) {}
object i3 {
val I4: I0[String] = this
}