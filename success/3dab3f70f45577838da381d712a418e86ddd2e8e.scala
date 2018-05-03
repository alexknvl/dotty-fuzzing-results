import language.higherKinds
object i0 {
def apply(i1: Int): Unit =
i1 match {
case 1 => 1
case `i1` => true
}
}