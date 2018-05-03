trait I0 {
type i1 >: Null <: I0 with i2
trait I3
type i2 <: I3
type i4 <: i2 with I0
}