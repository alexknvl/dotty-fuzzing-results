package object I0 {
val i1 = 0
~i1;
def i1(i1: Int): Unit = ???
}
object I2 {
import Serializable.{ i3 =>
val i3 = I0
i3 { I2 =>
i1
}
}
}