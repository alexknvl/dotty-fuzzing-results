object I0 {
val I1: _ with AnyRef = null
implicit def I2: I1.this.type = this
def ::[@specialized I2 <: Int] = (I2: Int) =>
I2
}
}