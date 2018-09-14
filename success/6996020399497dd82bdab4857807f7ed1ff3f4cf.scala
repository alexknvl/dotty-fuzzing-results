object i0 {
def unapply(I1: Any, i2: String) = I1 match {
case 1 :: List(8, map: _*) => 1 case _ =>
}
}