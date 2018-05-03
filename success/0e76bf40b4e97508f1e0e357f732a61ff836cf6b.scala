class i0 {
def i0(i1: Any) =
i1 match {
case (_: i0) => 1
case _ => throw new Exception
}
}