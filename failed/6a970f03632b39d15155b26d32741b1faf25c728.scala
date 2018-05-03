object I0 {
val i1: _ with AnyRef = null
implicit def i1: i1.this.type = this
def ::[@specialized i2 <: Int] = (i1: Int) =>
i2
}
}