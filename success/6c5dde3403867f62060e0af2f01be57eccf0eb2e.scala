object I0 {
def i1(i1: Any) = i1 match {
case i2 if i2 == i1 =>
case Some(i2) => Some(i2)
case _: Array[String] => implicit i1: String => println()
case _: Array[String] => println()
case _ => case _ =>
}
}