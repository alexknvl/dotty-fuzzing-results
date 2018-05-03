object i0 {
def i0(I1: Class[_]) = I1 match {
case _: Array[Array[_]] => case _ => false;
}
}