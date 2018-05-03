object i0 {
val I1: _ with AnyRef = null
implicit def i2: I1.this.type = this
def ::[@specialized I3 <: Int] = (i2: Int) =>
I3
}
}