class i0 {
def I1(I1: Any) =
I1 match {
case (_: i0) => 1
case _ => throw new Exception
}
}