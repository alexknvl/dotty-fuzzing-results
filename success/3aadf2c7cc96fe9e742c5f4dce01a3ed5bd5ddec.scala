object I0 {
trait I0 {
def I0: I1
}
trait I1 {
def I0: this.type
}
}