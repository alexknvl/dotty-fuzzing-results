object I0 {
def I0(I1: Any) = I1 match {
case _ => if (I1 == 2) new Object()
}
}