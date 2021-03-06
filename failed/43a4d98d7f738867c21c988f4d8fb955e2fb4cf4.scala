trait ModuleSig {
  type F[_]
  type U

  trait FooSig {
    type Type = F[U]
    def subst[F[_]](fa: F[Int]): F[Type]
  }

  val Foo: FooSig
}

sealed abstract class K[F]
final case object K1 extends K[Int]
final case object K2 extends K[Foo]

object App {
  val Module: ModuleSig = new ModuleSig {
    type F[A] = Int

    val Foo: FooSig = new FooSig {
      // type Type = Int
      def subst[F[_]](fa: F[Int]): F[Type] = fa
    }
  }

  def main(args: Array[String]): Unit = {
    type Foo = Module.Foo.Type

    val kv: K[Foo] = Module.Foo.subst[K](K1)
    def test(k: K[Foo]): Unit = k match {
      case K2 => ()
    }

    test(kv)
  }
}