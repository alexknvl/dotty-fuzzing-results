object I0 {
def unapply[I1](implicit I1: Int) = I1 match {
case 42 => (this, I1)
}
}