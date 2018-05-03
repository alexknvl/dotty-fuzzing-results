trait i0 {
type Dynamic <: Any with I1
trait I1
type I2 >: I1
type I2 <: i0 {
type I1 <: I2;
val I2: I2; }
def i3(implicit i3: => i4.I5): Unit = {}
}
class i4 {
assert(I2(, I2 == i3.I1))
}
}
}
}