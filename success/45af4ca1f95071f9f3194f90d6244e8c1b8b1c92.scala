import language.higherKinds
object I0 {
def apply(I0: Int): Unit =
I0 match {
case 1 => 1
case `I0` => true
}
}