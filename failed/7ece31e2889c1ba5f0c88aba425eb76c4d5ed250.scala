object i0 {
val i0: _ with AnyRef = null
implicit def I1: i0.this.type = this
def ::[@specialized I1 <: Int] = (I1: Int) =>
I1
}
}