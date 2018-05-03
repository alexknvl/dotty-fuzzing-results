object I0 {
def i1(i1: => Int): Int = 0
assert (i1 == i1)
}