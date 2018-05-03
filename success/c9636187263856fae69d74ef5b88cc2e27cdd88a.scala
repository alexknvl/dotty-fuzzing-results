trait I0 {
def apply(I1: String): String = ""
}
class I2 extends I0 {
type I1 = String
}