object i0 {
def i0(i1: Any) = i1 match {
case i1: RuntimeException =>
case _ => println( + 5)
}
}