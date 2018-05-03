trait W {
  type A
}
trait X extends W {
  type A = B
  type B
}
trait Y extends W {
  type A
  type B = A
}

trait Foo[X <: W, Y <: W] {
  type Z = X & Y
  val z: Z
  val a: z.A
}

trait Boo {
  val f: Foo[X, Y]
}

trait Baz extends Boo {
  val a = f.a // only this line triggers StackOverflow
  // remove it and it compiles fine
}