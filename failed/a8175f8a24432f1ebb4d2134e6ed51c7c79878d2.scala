object I0 {
val I0 = 10
I0 = 2
}
abstract class I1 {
private val I0: String = ()
}
import I0.{ I1 =>
val I2 = contains("", () => I1) {}
}