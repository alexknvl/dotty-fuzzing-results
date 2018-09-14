trait i0 {
trait I1 {}
trait I2 { def next: Int; }
trait i3 {}
protected[this] type I4 <: I1 { type I2 = String } with i0
implicit def I1: I2 = {}
val i5: I4[Int] = ???
implicitly[I1.i5.i5#i5]
}
object I1 {
import i0.i5.{ I4, i3 => }
val i5: i3#i5 = i5 i5 i5 I2 i5
}