import scala.reflect.i0
object i0
trait I1[I1, +I1, I1 <: I1, I1 <: i0]
trait I2 {
type I1[I2]
type I2[_ <: I1, I2, I2[I1 <: I2[I1]]
]: I1[I1, I1] = I1[I1]#I2
}
trait I1 {
type I1[I1]
type I1[I1, I2 <: I1[I1, I1]] <: I1 {
type I1[I1]
type I1[I1 <: I2[I1 <: I2[I1]], I2[I1 <: I1[I1 <: I2]] <: I1[I1, I2],
I1] = I2;
I1[I2, I1] }