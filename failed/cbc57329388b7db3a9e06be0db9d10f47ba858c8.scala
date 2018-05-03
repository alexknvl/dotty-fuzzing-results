object App {
  abstract class Boo[E <: Nothing { type R }] {
    val r: E
    type R = r.type#R
  }

  trait Leibniz[+U, A <: U, B <: U] {
    def subst[F[_ <: U]](fa : F[A]): F[B]
  }
  def refl[A]: Leibniz[A, A, A] = new Leibniz[A, A, A] {
    def subst[F[_ <: A]](fa : F[A]): F[A] = fa
  }

  val p = refl[Nothing] : Leibniz[Nothing {type R}, Nothing { type R = Int }, Nothing { type R = String }]

  def main(args : Array[String]): Unit = {
    // BOOM
    val s : String = p.subst[[x <: Nothing { type R }] => Boo[x]#R](10)
  }

}