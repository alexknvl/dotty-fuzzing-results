object App {
  def coerce[U, V](u: U): V = {
    trait X { type R >: U }
    trait Y { type R = V }

    abstract class Boo[E <: Any { type R }] {
      val r: E
      type R = r.type#R
    }

    class T[X <: Any { type R }](val value: Boo[X]#R)

    val a = new T[Y & X](u)
    a.value
  }

  def main(args: Array[String]): Unit = {
    // BOOM
    val s: String = coerce[Int, String](10)
  }
}