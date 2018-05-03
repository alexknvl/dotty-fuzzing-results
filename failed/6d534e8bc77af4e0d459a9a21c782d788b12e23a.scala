object i0 {
val I1 = 10
I1 = 2
}
abstract class i2 {
private val I1: String = ()
}
import i0.{ i2 =>
val i3 = contains("", () => i2) {}
}