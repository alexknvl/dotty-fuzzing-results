object I0 {
def I0(i1: Int, I2: Int) = i1 match {
case I2 @ _ => i1
case (I2, I2) => ()
}
}