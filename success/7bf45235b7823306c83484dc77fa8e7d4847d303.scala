object i0 {
type I1
def I1[I1[I2], I2](I2: I1[List[_]]) =
I2 match {
case map => 0
}
}