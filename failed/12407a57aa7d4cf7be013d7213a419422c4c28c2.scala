object App {
  type Id[A] >: A <: A
  val a: List[_ >: Id[_]] = List(0)
  def main(args: Array[String]): Unit =
    println(a)
}