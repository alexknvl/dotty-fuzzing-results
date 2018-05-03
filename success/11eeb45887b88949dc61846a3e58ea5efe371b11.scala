class I0 {
def I0(I0: Any) =
I0 match {
case (_: I0) => 1
case _ => throw new Exception
}
}