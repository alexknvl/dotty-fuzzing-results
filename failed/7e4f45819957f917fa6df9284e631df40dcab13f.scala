object I0 {
implicit val I0 = null
val I1: Int = I0.I1
I0.i2()
}
object I0 {
def i2 =
import I0.I0
import Function0.{ i2 =>
}
val i3: {type i2 = { val i3: i2; val I4: i3.I0 };
}
}