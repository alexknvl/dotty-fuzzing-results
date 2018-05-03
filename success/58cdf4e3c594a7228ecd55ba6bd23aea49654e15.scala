class I0
class I1[I1]
class I2 extends I1[I0]
object I2 extends I1[Int] {
var I3 = classOf[I0]
}