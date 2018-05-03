object I0 {
def I0: Any = (null: Any) match {
case 1 => 1
case Some(i1) => I0 }
}