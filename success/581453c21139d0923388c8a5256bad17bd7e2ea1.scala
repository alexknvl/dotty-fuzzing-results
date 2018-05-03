object i0 {
trait I1[+i2]
trait i2 extends I1[i2] { def i2(i3: I1[this.type]): i2 }
}