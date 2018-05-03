class I0 {
def I1(I2: Any) =
I2 match {
case (_: I0) => 1
case _ => throw new Exception
}
}