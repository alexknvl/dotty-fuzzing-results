import scala.language.dynamics
class i0 extends scala.Dynamic {
def I1(I2: Any) = I2 match {
case _: Some[Any] => None
}
}