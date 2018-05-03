object I0 {
class I1 {
def i2: I1.i3 = this
}
val i3: I1
}
trait i3 {
type I1
type i2
type i3
}
object i3 extends i3 {
type i3 = I1
val i3: I0 = ???
import I0.{ I4 => }
}
}