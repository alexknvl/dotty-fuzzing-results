trait I0 {
private def I1: Int = 1
var I1: Int = 5
}
object I2 {
import I0.I1.{ classTag, I1 =>
val I3 = null
I1 }
object I3 {
implicit def I4: String =
}