class I0 {
def apply(I1: Int): Int = 1
}
class I1 extends I0 {
def I1(): I1 = new I1() {}
(null: I0) match {
case _: I1 =>
}
}