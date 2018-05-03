object I0 {
type I0 = Int
def I1(I2: I0): Any = I2 match {
case _: I0 => I0 }
}