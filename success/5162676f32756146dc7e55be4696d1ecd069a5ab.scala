class I0 {
def I1(I2: List[_ <: I0]) = I2.asInstanceOf[Int]
}