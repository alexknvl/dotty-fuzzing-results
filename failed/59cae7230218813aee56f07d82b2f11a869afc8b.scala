class I0 {
class I1 { type I1 }
type I1 = I1.I1
type i2 = I0 { type I1 <: i2 }
type I3 = Int
type I4 = I1.I1 = new I0 { def i2: I3 = ??? }
}