object I0 {
def I1(I2: Any) = I2 match {
case _ => if (I2 == 2) new Object()
}
}