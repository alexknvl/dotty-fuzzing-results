trait I0[+I0] {
def i1: i2
}
trait i2 {
type I0[+i1 <: this.type]
}