trait I0[+I1] {
def I2: I3
}
trait I3 {
type I1[+I2 <: this.type]
}