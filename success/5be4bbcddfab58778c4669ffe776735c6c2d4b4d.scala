object i0 {
def i0(i0: Int, I1: Int) = i0 match {
case I1 @ _ => i0
case (I1, I1) => ()
}
}