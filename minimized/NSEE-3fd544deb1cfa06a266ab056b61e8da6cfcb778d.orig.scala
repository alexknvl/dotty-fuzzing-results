class I0[I0, i1](val I2: I2) {}
trait I2[+I0, i1] {
def i1[I0[_]](I3: I0[i1, I2]): I2[i1] = ???
val i4 = new I0
i4.i4.i4
val i1 = I2[I2, I2] { }
i1[(Int, String)]
}