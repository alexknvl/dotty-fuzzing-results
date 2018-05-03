import language.higherKinds
object I0 {
def apply(I1: Int): Unit =
I1 match {
case 1 => 1
case `I1` => true
}
}