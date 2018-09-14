object i0 {
def unapply(i1: Any, i2: String) = i1 match {
case 1 :: List(8, map: _*) => 1 case _ =>
}
}