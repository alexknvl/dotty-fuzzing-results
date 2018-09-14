trait I0 {
trait i1 {}
trait I2 { def next: Int; }
trait I3 {}
protected[this] type i4 <: i1 { type I2 = String } with I0
implicit def i1: I2 = {}
val i4: i4[Int] = ???
implicitly[i1.i4.i4#i4]
}
object i1 {
import I0.i4.{ i4, I3 => }
val i4: I3#i4 = i4 i4 i4 I2 i4
}