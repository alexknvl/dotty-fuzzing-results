trait I0[I0[_]]
implicit object I0 {
implicit def I1[I1]: I0[I0 => I0] => Any
}
trait I1[+I1, +I1 <: _ { type I0[I1 <: I0[I1]] extends I1[I0, I1] with I1[I0] }
type I0 = I1[I1, I0]
type I1 = I1#I0[I1] with I1[I1, I1]
class I0[+I0](val I1: I0)
case class I1() extends I0[I1](val I1: Int);
class I0 extends I1[I1](new I0) {
trait I1[I0[I1 <: I1[I0]], I0] {
def I0(I1: I1[I1]): Unit =
for (I1 <- this;
for (I1 <- 0 I0(this _)
for (I0 <- I1) else this)
}
}