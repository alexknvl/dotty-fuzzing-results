trait i0 {
type I1 <: I2;
private type I2 <: i0 {
def I3: String;
def I3(I3: I1): I3
val I3: I2
}
object I3 extends App {
private[this] def I4(I4: I2): Unit = this.I4 ||
I3
println(I4.I1())
}