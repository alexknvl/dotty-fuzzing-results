class I0 {
def I0(I1: List[_ <: I0]) = I1.asInstanceOf[Int]
}