object I0 {
trait i1[+I2]
trait I2 extends i1[I2] { def I2(I3: i1[this.type]): I2 }
}