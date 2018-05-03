object App {
  def coerce[U, V](u: U): V = {
    trait X { type R >: U }
    trait Y { type R = V }

    abstract class Boo {
      val r: Y & X
      type R = r.R
    }
    // OR
    // final class Boo(val r: Y & X) {
    //  type R = r.R
    // }

    (u: Boo#R)
  }

  def main(args: Array[String]): Unit = {
    // BOOM
    val s: String = coerce[Int, String](10)
  }
}