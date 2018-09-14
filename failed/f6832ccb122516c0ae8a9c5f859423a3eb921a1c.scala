trait I0 {
trait I1 {}
trait i2 { def next: Int; }
trait i2 {}
protected[this] type I3 <: I1 { type i2 = String } with I0
implicit def I1: i2 = {}
val I3: I3[Int] = ???
implicitly[I1.I3.I3#I3]
}
object I1 {
import I0.I3.{ I3, i2 => }
val I3: i2#I3 = I3 I3 I3 i2 I3
}