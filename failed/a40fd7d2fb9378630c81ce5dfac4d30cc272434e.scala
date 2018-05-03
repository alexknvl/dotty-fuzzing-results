trait I0 {
type Dynamic <: Any with i1
trait i1
type i2 >: i1
type i2 <: I0 {
type i1 <: i2;
val I3: i2; }
def i4(implicit i4: => I5.I5): Unit = {}
}
class I5 {
assert(i2(, i2 == i4.i1))
}
}
}
}