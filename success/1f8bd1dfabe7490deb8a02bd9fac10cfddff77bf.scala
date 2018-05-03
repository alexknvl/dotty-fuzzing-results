package I0
import scala.language.dynamics
class I0 extends scala.Dynamic {
def selectDynamic(I1: Int): Any = I1 match {
case _: Int => case _ =>
}
}