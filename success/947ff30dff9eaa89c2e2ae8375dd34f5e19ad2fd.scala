object i0 {
def i1(I2: Class[_]) = I2 match {
case _: Array[Array[_]] => case _ => false;
}
}