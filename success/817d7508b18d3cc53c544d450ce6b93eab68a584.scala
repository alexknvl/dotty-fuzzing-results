class I0 {
def I0(I0: Any, I1: List[_ <: Int]) = sys.error("")
}
trait I1 { I0: I0 =>

}