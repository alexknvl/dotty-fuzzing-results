import scala.language.dynamics
class I0 extends scala.Dynamic {
def I1(i2: Any) = i2 match {
case _: Some[Any] => None
}
}