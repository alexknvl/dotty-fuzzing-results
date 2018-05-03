class i0 {
class I1 { type i2 }
type i3 = I1.i2
type I4 = i0 { type I1 <: I4 }
type I4 = Int
type I5 = i3.I1 = new i0 { def I4: I4 = ??? }
}