object I0 {
trait I0
trait I1
type I2 <: I1
type I3 = I2
def I4(I2: => Int, I4: String) = sys.error("")
}