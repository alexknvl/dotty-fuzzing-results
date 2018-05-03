object i0 {
def unapply[i1](implicit i1: Int) = i1 match {
case 42 => (this, i1)
}
}