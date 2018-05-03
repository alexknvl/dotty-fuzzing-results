object i0 {
val I1: _ with AnyRef = null
implicit def I1: I1.this.type = this
def ::[@specialized I1 <: Int] = (I1: Int) =>
I1
}
}