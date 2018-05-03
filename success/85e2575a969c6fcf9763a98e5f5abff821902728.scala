object I0 {
def I0(I1: String) = I1
def I1(I1: Int): Any = true
def I1(i2: Any) = i2 match {
case _: Any => false
}
}