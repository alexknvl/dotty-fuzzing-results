trait I0 {
type Dynamic <: Any with i1
trait i1
type I2 >: i1
type I3 <: I0 {
type i1 <: I2;
val I4: I2; }
def I5(implicit I5: => I5.I6): Unit = {}
}
class I5 {
assert(I3(, I2 == I5.i1))
}
}
}
}