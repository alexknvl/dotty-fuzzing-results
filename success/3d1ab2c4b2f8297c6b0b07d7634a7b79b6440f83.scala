object i0 {
def I1: Any = (null: Any) match {
case 1 => 1
case Some(i2) => I1 }
}