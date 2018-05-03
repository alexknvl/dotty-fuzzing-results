trait I0 {
type i1 <: I2;
private type I2 <: I0 {
def i3: String;
def i4(i4: i1): i3
val I5: I2
}
object I5 extends App {
private[this] def I5(I5: I2): Unit = this.I5 ||
i4
println(I5.i1())
}