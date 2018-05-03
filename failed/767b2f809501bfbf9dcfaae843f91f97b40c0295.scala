class Fix[F[_]] {
  class Foo { type R >: F[T] <: F[T] }
  type T = F[Foo#R]
}

object App {
  type Nat = Fix[Option]#T
}