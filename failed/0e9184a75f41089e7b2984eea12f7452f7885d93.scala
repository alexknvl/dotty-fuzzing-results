trait I0 {
private def i1: Int = 1
var i1: Int = 5
}
object i1 {
import I0.i1.{ classTag, i1 =>
val i2 = null
i1 }
object i2 {
implicit def i2: String =
}