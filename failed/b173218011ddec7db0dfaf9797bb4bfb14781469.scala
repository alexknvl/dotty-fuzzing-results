import scala.I0.{ I0 => }
object I0 {
private[this] { object I1 extends I0 { new I0 { case I0 => type I0 = Int } }
implicit object I1 extends Object {
new I1 :: Int
val I1 = new I0
implicit def I1: String = .asInstanceOf[String]
val I1: I0 = I1.I1()
}
}