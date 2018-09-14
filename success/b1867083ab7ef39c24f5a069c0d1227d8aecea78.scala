class I0 {
def I1(I1: implicit Int => Double) = sys.error("")
}
object I0 {
new I0().I1 }