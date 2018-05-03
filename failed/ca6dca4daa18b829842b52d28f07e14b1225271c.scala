class I0 {
private[I0] def I0: Int = 0
}
object I0 {
def I1[I1 <: I0](I1: I1): I1 = sys.error("")
}
import I0.{ I1 =>
class I1
}
object I1{
class I1[@specialized I1, Option I1, I1](I1: I0[I0, I1]) extends I0(Array[I1]) {}
object I1 {
val I1: I0[String] = this
}