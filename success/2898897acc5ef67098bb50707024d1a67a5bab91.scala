package I0
import scala.language.dynamics
class I1 extends scala.Dynamic {
def selectDynamic(I2: Int): Any = I2 match {
case _: Int => case _ =>
}
}