object I0 {
val I0: _ with AnyRef = null
implicit def I1: I0.this.type = this
def ::[@specialized I2 <: Int] = (I1: Int) =>
I2
}
}