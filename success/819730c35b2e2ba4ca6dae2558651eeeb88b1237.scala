object i0 {
def unapply[i0](implicit i0: Int) = i0 match {
case 42 => (this, i0)
}
}