trait I0 {
protected def I1 = -1
}
class I1 extends I0 {
val i2 =  + 5;
}
object I1 {
object i3 extends I1
val i4 = { class i4(I1: => Int, i3: Int) }
}