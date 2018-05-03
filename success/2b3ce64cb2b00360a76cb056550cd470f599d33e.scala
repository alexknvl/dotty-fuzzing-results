object I0 {
def I0[I1](I1: Any) = ()
def I1(I1: Any) = I1 match {
case _ => false
}
}