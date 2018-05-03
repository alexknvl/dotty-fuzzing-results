trait i0 {
type I1 >: Null <: i0 with i2
trait i3
type i2 <: i3
type I4 <: i2 with i0
}