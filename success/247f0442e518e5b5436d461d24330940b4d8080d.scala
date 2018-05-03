trait I0 {
def I1: Int = 4
def I2: implicit Int => Int = I1;
}