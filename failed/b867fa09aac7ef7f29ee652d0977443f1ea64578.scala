class Foo[U](val u: Array[Int] & Array[U]) {
  val x = u(0)
}
object App {
  def main(args: Array[String]): Unit = {
    val a = new Foo[Int](Array(0, 1))
    println(a.x)
  }
}