trait i0 {
type i1 <: i2;
private type i2 <: i0 {
def i3: String;
def I4(I4: i1): i3
val I5: i2
}
object I5 extends App {
private[this] def i6(i6: i2): Unit = this.i6 ||
I4
println(i6.i1())
}