object I0 {
implicit val i1 = null
val I2: Int = i1.I2
i1.I2()
}
object i1 {
def I2 =
import I0.i1
import Function0.{ i4 =>
}
val I5: {type I3 = { val I5: I3; val I5: I5.i1 };
}
}