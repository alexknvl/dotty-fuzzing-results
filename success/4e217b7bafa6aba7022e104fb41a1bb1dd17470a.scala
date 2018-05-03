class i0 {
def i1(I2: Any) =
I2 match {
case (_: i0) => 1
case _ => throw new Exception
}
}