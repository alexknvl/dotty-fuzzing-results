object i0 {
def i1(I2: Int, I3: Int) = I2 match {
case I3 @ _ => I2
case (I3, I3) => ()
}
}