object I0 {
trait I0[@specialized(Int) i1] {
val i2: (I0 { type i1 = i2 }) {}
i2 = (i3 _) match {
case _: i1.I0 => i2 = sys.error()
}
}
}
}
}