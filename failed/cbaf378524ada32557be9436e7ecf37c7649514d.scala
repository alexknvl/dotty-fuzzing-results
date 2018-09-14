trait I0 {
trait I1 {}
trait i2 { def next: Int; }
trait i3 {}
protected[this] type i3 <: I1 { type i2 = String } with I0
implicit def I1: i2 = {}
val i4: i3[Int] = ???
implicitly[I1.i4.i4#i4]
}
object I1 {
import I0.i4.{ i3, i3 => }
val i4: i3#i4 = i4 i4 i4 i2 i4
}