object App {
  type Id[A] >: A
  val a: List[_ >: Id[Int]] = List(1, 2)
}