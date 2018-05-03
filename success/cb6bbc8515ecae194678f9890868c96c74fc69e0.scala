package I0
import scala.language.dynamics
class I0 extends scala.Dynamic {
def selectDynamic(i1: Int): Any = i1 match {
case _: Int => case _ =>
}
}