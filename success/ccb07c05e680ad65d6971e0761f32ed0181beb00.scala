trait I0 {
def I1 = 4
}
object I2 extends I0 {
private[this] def I1 = 0
}