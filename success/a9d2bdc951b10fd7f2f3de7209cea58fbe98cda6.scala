import scala.language.dynamics
class I0 extends scala.Dynamic {
def I0(I0: Any) = I0 match {
case _: Some[Any] => None
}
}