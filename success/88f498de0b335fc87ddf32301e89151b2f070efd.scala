class I0 {
def i1(i1: Any) =
i1 match {
case (_: I0) => 1
case _ => throw new Exception
}
}