trait I0 {
private def I1: Int = 1
var I1: Int = 5
}
object i2 {
import I0.I1.{ classTag, I1 =>
val i2 = null
I1 }
object i3 {
implicit def i4: String =
}