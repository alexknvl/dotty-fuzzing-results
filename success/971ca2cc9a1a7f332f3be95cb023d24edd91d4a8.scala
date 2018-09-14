trait I0 {
object i2
case class i1()
}
object i2 {
val i2 = new I0 {}
val i1: i2.type = null
}