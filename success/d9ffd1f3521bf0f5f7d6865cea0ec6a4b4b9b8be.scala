trait i0 {
type I1 <: 1
}
trait I2 {
type I1
type i3 <: I2
type i4 <: I2 with i3
type I5 <: I1
type i6 = List[i4]
}
object i7 {
val i7: List[Int => String] = i7
}