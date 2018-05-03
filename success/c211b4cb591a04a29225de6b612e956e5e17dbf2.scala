object i0 {
def i1(i2: Any) = i2 match {
case i2: RuntimeException =>
case _ => println( + 5)
}
}