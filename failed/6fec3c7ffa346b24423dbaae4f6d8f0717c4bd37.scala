object App {
  type Id[A] >: A <: A
  val a: List[_ >: Id[_]] = List(0)
}