class i0 {
@inline
def i1: Int = 0
}
trait I2 {
def i3(I2: => Int)(implicit i3: Int): Unit =
i3
}