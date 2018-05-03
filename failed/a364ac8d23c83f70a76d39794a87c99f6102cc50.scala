class I0 {
class i1 { type i1 }
type i1 = i1.i1
type i2 = I0 { type i1 <: i2 }
type i2 = Int
type i3 = i1.i1 = new I0 { def i2: i2 = ??? }
}