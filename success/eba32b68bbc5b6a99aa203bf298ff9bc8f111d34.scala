object i0 {
trait I1[+I2]
trait I2 extends I1[I2] { def I3(i4: I1[this.type]): I2 }
}