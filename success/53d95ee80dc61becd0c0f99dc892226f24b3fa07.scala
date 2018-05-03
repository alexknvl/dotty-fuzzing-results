package i0
import scala.language.dynamics
class I1 extends scala.Dynamic {
def selectDynamic(i2: Int): Any = i2 match {
case _: Int => case _ =>
}
}