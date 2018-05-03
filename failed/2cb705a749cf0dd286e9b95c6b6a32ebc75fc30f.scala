object App {
  def main(args: Array[String]): Unit = {
    trait FooT {
      type T
    }
    val Foo: FooT = new FooT {
      type T = Int
    }
    type Foo = Foo.T
    type Bar = Foo

    sealed abstract class K[A]
    final case object K1 extends K[Int]
    final case object K2 extends K[Foo]
    final case object K3 extends K[Bar]

    def get(k: K[Int]): Unit = k match {
      case K1 => ()
      // case K2 => ()
      // case K3 => ()
    }
  }
}