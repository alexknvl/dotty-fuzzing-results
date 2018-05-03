object I0 {
val I0: _ with AnyRef = null
implicit def I0: I0.this.type = this
def ::[@specialized I1 <: Int] = (I0: Int) =>
I1
}
}