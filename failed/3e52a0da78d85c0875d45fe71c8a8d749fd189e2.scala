object I0 {
implicit val I0: Int = 42
import I0.{ I1, I1 }
}
class I1 {
implicit def I1(I1: Array[Any])(implicit I1: Int) = I0
}
class I1 extends (_ with I1)