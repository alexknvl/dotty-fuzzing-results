final class I0 {
def I0(i1: Int, i2: Int) = ()
}
object I3 extends App {
object I0 {
implicit val I3: (Int, Int) => Any = sys.error("")
}
}