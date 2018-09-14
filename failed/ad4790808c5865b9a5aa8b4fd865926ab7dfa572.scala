trait I0 {
trait i1 {}
trait I2 { def next: Int; }
trait I3 {}
protected[this] type I4 <: i1 { type I2 = String } with I0
implicit def i1: I2 = {}
val I4: I4[Int] = ???
implicitly[i1.I4.I4#I4]
}
object i1 {
import I0.I4.{ I4, I3 => }
val I4: I3#I4 = I4 I4 I4 I2 I4
}