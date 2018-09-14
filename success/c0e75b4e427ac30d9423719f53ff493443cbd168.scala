class I0 {
def i1(i1: implicit Int => Double) = sys.error("")
}
object I0 {
new I0().i1 }