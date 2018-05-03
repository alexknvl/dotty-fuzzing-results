class i0 {
class i1 { type i1 }
type i1 = i1.i1
type I2 = i0 { type i1 <: I2 }
type I2 = Int
type I2 = i1.i1 = new i0 { def I2: I2 = ??? }
}