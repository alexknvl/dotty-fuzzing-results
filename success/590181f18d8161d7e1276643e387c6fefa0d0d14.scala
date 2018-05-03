object i0 {
def i0: Any = (null: Any) match {
case 1 => 1
case Some(i1) => i0 }
}