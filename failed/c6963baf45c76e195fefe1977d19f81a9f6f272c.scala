trait i0 {
type I1 <: i2;
private type i2 <: i0 {
def I3: String;
def i4(i4: I1): I3
val I5: i2
}
object I5 extends App {
private[this] def I5(I5: i2): Unit = this.I5 ||
i4
println(I5.I1())
}