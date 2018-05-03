import scala.language.dynamics
class I0 extends scala.Dynamic {
def I0(i1: Any) = i1 match {
case _: Some[Any] => None
}
}