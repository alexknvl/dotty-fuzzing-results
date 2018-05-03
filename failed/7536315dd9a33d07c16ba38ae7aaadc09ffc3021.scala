object i0 {
val i0: _ with AnyRef = null
implicit def i1: i0.this.type = this
def ::[@specialized I2 <: Int] = (i1: Int) =>
I2
}
}