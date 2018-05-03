object I0 {
def apply(I0: Int): String = ""
}
object I1 {
import I0._
println(I0)
}