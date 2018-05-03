class I0 {
def apply(I0: Int): Int = 1
}
class I1 extends I0 {
def I1(): I0 = new I0() {}
(null: I0) match {
case _: I1 =>
}
}