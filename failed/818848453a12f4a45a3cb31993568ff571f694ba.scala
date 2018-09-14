object I0 {
trait I0[@specialized(Int) I1] {
val I1: (I0 { type I1 = I1 }) {}
I1 = (I1 _) match {
case _: I1.I0 => I1 = sys.error()
}
}
}
}
}