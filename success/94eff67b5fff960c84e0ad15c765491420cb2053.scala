object I0 {
def I0(I1: String) = I1
def I2(I2: Int): Any = true
def I2(I2: Any) = I2 match {
case _: Any => false
}
}