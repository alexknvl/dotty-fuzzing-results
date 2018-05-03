object I0 {
trait i1[+i2]
trait i2 extends i1[i2] { def I3(I3: i1[this.type]): i2 }
}