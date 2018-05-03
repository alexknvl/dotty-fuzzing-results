trait I0 {
def I0: Int = 4
def I1: implicit Int => Int = I0;
}