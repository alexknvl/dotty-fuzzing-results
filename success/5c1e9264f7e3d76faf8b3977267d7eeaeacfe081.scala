trait I0[+I1] {
def I2: I2
}
trait I2 {
type I1[+I2 <: this.type]
}