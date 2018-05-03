object I0 {
implicit val I0: Int = 42
import I1.{ I2, I3 }
}
class I3 {
implicit def I4(I4: Array[Any])(implicit I3: Int) = I1
}
class I4 extends (_ with I4)