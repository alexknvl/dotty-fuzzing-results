object I0 {
def I1(I1: Class[_]) = I1 match {
case _: Array[Array[_]] => case _ => false;
}
}