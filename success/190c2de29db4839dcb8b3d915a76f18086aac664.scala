trait I0 {
trait I1 {
type I1 <: { type I1 }
type I2
}
case object I1 extends AnyRef with I1
}