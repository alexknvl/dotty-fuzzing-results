class I0 {
def I0(I1: Any) =
I1 match {
case (_: I0) => 1
case _ => throw new Exception
}
}