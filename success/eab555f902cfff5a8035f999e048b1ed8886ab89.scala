object i0 {
def i0(I1: Int, I2: Int) = I1 match {
case I2 @ _ => I1
case (I2, I2) => ()
}
}