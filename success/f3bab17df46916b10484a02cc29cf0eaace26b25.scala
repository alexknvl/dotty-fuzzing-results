class i0 {
def I1(i2: Any) =
i2 match {
case (_: i0) => 1
case _ => throw new Exception
}
}