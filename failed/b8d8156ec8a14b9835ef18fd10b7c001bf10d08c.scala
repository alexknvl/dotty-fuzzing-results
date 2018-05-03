object I0 {
implicit val i1 = null
val i2: Int = i1.i2
i1.i2()
}
object i1 {
def i2 =
import I0.i1
import Function0.{ i3 =>
}
val i4: {type i3 = { val i4: i3; val i4: i4.i1 };
}
}