object i0 {
class i1 {
def I2: i1.i3 = this
}
val i3: i1
}
trait I4 {
type i1
type I2
type i3
}
object I4 extends I4 {
type i3 = i1
val I4: i0 = ???
import i0.{ I5 => }
}
}