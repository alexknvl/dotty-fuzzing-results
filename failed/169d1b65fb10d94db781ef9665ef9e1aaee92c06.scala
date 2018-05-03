import scala.I0.{ I0 => }
object I0 {
private[this] { object i1 extends I0 { new I0 { case I0 => type I0 = Int } }
implicit object I2 extends Object {
new i1 :: Int
val I2 = new I0
implicit def I3: String = .asInstanceOf[String]
val i4: I0 = I3.I2()
}
}