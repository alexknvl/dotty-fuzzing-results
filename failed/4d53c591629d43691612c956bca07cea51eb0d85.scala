object Main {
  type Nat
  object Nat {
    type Z <: Nat
    type S[N <: Nat] <: Nat
  }

  object Church {
    object List {
      type Nil
        = [K, nil <: K, cons[_, _ <: K] <: K] => nil
      type Cons[A, H <: A, T[B <: A, K, nil <: K, cons[_ <: B, _ <: K] <: K] <: K]
        = [K, nil <: K, cons[_ <: A, _ <: K] <: K] => cons[H, T[A, K, nil, cons]]

      type Cata[L[K, nil <: K, cons[_, _ <: K] <: K] <: K,
                  K, nil <: K, cons[_, _ <: K] <: K]
        = L[K, nil, cons]
    }
  }

  def main(args: Array[String]): Unit = {
    import Nat._
    import Church.List._

    type L = Cons[Nat, S[Z], Cons[Nat, Z, Cons[Nat, S[Z], Nil]]]
  }
}