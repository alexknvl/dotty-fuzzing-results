object i0 {
def I1(i2: Class[_]) = i2 match {
case _: Array[Array[_]] => case _ => false;
}
}