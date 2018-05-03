object I0 {
implicit val i1 = null
val I2: Int = i1.I2
i1.I2()
}
object i1 {
def I2 =
import I0.i1
import Function0.{ i3 =>
}
val i3: {type i3 = { val i3: i3; val i3: i3.i1 };
}
}