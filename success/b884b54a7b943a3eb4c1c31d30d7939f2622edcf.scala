trait I0 {
def I0: implicit Unit => Double
}
trait I1[I1] {
def I1: this.type
}