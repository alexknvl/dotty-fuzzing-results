final class I0 {
def I0(I1: Int, I2: Int) = ()
}
object I2 extends App {
object I0 {
implicit val I3: (Int, Int) => Any = sys.error("")
}
}