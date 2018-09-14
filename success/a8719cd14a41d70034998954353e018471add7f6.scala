object I0 {
def unapply(I0: Any, i1: String) = I0 match {
case 1 :: List(8, map: _*) => 1 case _ =>
}
}