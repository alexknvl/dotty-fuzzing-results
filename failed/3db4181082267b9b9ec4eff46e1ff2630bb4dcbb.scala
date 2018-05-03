object App {
  def main(args: Array[String]): Unit = {
    class T(lazy val a: Int)
    new T(1)
  }
}