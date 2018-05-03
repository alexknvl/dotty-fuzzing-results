import language.higherKinds
object i0 {
def apply(i0: Int): Unit =
i0 match {
case 1 => 1
case `i0` => true
}
}