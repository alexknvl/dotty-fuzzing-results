trait I0[+I0] {
def I0: I1
}
trait I1 {
type I0[+I0 <: this.type]
}