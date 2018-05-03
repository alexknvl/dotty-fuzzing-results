object I0 {
def apply(I1: Int): String = ""
}
object I1 {
import I0._
println(I1)
}