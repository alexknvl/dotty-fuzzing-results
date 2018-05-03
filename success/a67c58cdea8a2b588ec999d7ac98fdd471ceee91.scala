object I0 {
def i1(i1: Class[_]) = i1 match {
case _: Array[Array[_]] => case _ => false;
}
}