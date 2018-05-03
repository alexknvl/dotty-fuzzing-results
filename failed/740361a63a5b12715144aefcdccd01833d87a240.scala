trait I0[I0] {
def I1[I1 <: I0](I1: I0): I0[I0] = sys.error("")
match {
case I1: I0[I1] => I1.asInstanceOf[I1]
}
def I1[I1 <: Array[I1]](I1: I0, I1: I0[I1]): I1[I1, Nothing] = new I1[I1, I0] yield I0[I1](I1) trait I0[I0] extends I0
object I0 {
def I0(I0: I1[Any, I0]) = I1
val I0 = new I0
implicit def I1[I1]: I0[I1] = Nil
}
trait I1[I0] {
def I0[I1, I1](I1: I1[I0, I0], I0: I1[I0, I1, I0, I0, I0, I1, I0, I0, I0) = (I0, I1, Unit)
}