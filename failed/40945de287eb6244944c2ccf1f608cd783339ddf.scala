object I0 {
implicit val i1 = null
val i2: Int = i1.i2
i1.i3()
}
object i1 {
def i3 =
import I0.i1
import Function0.{ i4 =>
}
val i5: {type i4 = { val i5: i4; val i6: i5.i1 };
}
}