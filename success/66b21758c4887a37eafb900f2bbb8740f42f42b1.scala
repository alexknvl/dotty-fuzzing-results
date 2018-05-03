object i0 {
def i0(i1: Class[_]) = i1 match {
case _: Array[Array[_]] => case _ => false;
}
}