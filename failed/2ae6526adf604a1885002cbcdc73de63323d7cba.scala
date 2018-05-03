object i0 {
implicit val I1: Int = 42
import I1.{ I1, I2 }
}
class I2 {
implicit def I2(I2: Array[Any])(implicit I2: Int) = I1
}
class I2 extends (_ with I2)