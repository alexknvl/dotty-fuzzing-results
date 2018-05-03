object I0 {
def unapply[I0](implicit I0: Int) = I0 match {
case 42 => (this, I0)
}
}