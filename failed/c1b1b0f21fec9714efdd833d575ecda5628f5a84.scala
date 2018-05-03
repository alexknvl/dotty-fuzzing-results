class i0 {
class I1 { type I1 }
type I1 = I1.I1
type i2 = i0 { type I1 <: i2 }
type i3 = Int
type I4 = I1.I1 = new i0 { def i2: i3 = ??? }
}