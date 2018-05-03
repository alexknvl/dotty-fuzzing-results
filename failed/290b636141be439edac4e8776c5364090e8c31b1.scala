trait I0 {
private def i1: Int = 1
var i1: Int = 5
}
object I2 {
import I0.i1.{ classTag, i1 =>
val I2 = null
i1 }
object I2 {
implicit def I3: String =
}