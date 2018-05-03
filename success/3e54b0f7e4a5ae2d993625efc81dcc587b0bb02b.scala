object I0 {
def I0(i1: Any) = i1 match {
case i1: RuntimeException =>
case _ => println( + 5)
}
}