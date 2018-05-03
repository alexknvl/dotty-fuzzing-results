object I0 {
val I1 = 10
I1 = 2
}
abstract class I2 {
private val I1: String = ()
}
import I0.{ I2 =>
val I2 = contains("", () => I2) {}
}