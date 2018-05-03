abstract class I0 {
final case class I1() extends I0
object I1 {
def I0() = {
lazy val i2 =
I1()
}
println(I1)
}
}