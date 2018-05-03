object i0 {
implicit val I1: Int = 42
import I1.{ i2, i2 }
}
class i2 {
implicit def i3(i3: Array[Any])(implicit i2: Int) = I1
}
class i4 extends (_ with i3)