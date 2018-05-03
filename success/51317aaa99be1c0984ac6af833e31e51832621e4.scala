object i0 {
def i0(i0: Any) = i0 match {
case i1 if i1 == i0 =>
case Some(i1) => Some(i1)
case _: Array[String] => implicit i0: String => println()
case _: Array[String] => println()
case _ => case _ =>
}
}