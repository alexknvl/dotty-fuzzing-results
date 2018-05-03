trait I0 {
type I1 >: Null <: I0 with I2
trait I3
type I2 <: I3
type i4 <: I2 with I0
}