trait X[R <: Z, Z >: X[R, R] <: X[R, R]] {
  // implicitly[Z =:= X[R, R]] // won't compile
}
class Z extends X[Z, Z]