trait i0 {
trait I1 {}
trait i2 { def next: Int; }
trait I3 {}
protected[this] type I4 <: I1 { type i2 = String } with i0
implicit def I1: i2 = {}
val I5: I4[Int] = ???
implicitly[I1.I5.I5#I5]
}
object I1 {
import i0.I5.{ I4, I3 => }
val I5: I3#I5 = I5 I5 I5 i2 I5
}