import scala.language.dynamics
class i0 extends scala.Dynamic {
def i0(I1: Any) = I1 match {
case _: Some[Any] => None
}
}