trait I0 {
trait i1 {}
trait i2 { def next: Int; }
trait i3 {}
protected[this] type i3 <: i1 { type i2 = String } with I0
implicit def i1: i2 = {}
val i3: i3[Int] = ???
implicitly[i1.i3.i3#i3]
}
object i1 {
import I0.i3.{ i3, i3 => }
val i3: i3#i3 = i3 i3 i3 i2 i3
}