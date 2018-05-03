trait I0 {
def I0: implicit Unit => Double
}
trait I1[I2] {
def I2: this.type
}