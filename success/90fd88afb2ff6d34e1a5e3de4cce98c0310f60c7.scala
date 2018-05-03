object I0 {
def I0: Int = 10
def I0[I1]: Seq[_] = sys.error("")
}
sealed trait I2