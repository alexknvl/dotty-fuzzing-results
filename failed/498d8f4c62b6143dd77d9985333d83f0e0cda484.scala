object I0 {
val i1: _ with AnyRef = null
implicit def I2: i1.this.type = this
def ::[@specialized I3 <: Int] = (I2: Int) =>
I3
}
}