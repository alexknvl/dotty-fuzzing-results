object I0 {
val I0: _ with AnyRef = null
implicit def i1: I0.this.type = this
def ::[@specialized i1 <: Int] = (i1: Int) =>
i1
}
}