object i0 {
val i1: _ with AnyRef = null
implicit def i1: i1.this.type = this
def ::[@specialized I2 <: Int] = (i1: Int) =>
I2
}
}