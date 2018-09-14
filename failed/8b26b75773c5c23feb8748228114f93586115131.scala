trait I0 {
trait I0 {}
trait i1 { def next: Int; }
trait i1 {}
protected[this] type I2 <: I0 { type i1 = String } with I0
implicit def I0: i1 = {}
val I2: I2[Int] = ???
implicitly[I0.I2.I2#I2]
}
object I0 {
import I0.I2.{ I2, i1 => }
val I2: i1#I2 = I2 I2 I2 i1 I2
}