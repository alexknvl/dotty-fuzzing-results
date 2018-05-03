trait X[R <: Z, Z >: X[R, R]] {
  // def foo(x: X[R, R]): Z = x
}
class Z extends X[Z, Z]