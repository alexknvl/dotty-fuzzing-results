import language.higherKinds
object I0 {
def apply(i1: Int): Unit =
i1 match {
case 1 => 1
case `i1` => true
}
}