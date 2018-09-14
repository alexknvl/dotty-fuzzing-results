object I0 {
trait I0[@specialized(Int) I1] {
val i2: (I0 { type I1 = i2 }) {}
i2 = (i2 _) match {
case _: I1.I0 => i2 = sys.error()
}
}
}
}
}