object I0 {
def I0(I0: String): Unit = sys.error("")
}
trait I0 {
def I1(I1: I0): I0 = I1
}
class I1 extends I0