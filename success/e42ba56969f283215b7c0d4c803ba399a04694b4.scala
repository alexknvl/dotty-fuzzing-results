object I0 {
def I0[I0, I1 <: I0](I1: I0): Unit = {
lazy val I1 = I0 _ }
}