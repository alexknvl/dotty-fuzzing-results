object App {
  def main(args: Array[String]): Unit = {
    trait AgeT {
      type T
      def subst[F[_]](fa: F[Int]): F[T]
    }
    type Age = Age.T
    final val Age: AgeT = new AgeT {
      type T = Int
      def subst[F[_]](fa: F[Int]): F[T] = fa
    }

    sealed abstract class K[A]
    final case object KAge extends K[Age]
    final case object KInt extends K[Int]

    val kint: K[Age] = Age.subst[K](KInt)
    def get(k: K[Age]): String = k match {
      case KAge => "Age"
    }

    get(kint)
  }
}