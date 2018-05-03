class i0 {
class i1 { type i2 }
type i2 = i1.i2
type I3 = i0 { type i1 <: I3 }
type I3 = Int
type I3 = i2.i1 = new i0 { def I3: I3 = ??? }
}