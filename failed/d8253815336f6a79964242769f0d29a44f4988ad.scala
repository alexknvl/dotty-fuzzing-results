object i0 {
implicit val i0: Int = 42
import i0.{ i1, i1 }
}
class i1 {
implicit def I2(I2: Array[Any])(implicit i1: Int) = i0
}
class I3 extends (_ with I2)