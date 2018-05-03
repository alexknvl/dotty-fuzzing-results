object I0 {
implicit val I1: Int = 42
import I1.{ i2, I3 }
}
class I3 {
implicit def I3(i4: Array[Any])(implicit I3: Int) = I1
}
class i5 extends (_ with I3)