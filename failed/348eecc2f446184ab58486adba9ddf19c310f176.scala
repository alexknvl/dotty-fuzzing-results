class I0 {
class I1 { type I2 }
type I2 = I1.I2
type I3 = I0 { type I1 <: I3 }
type I3 = Int
type I4 = I2.I1 = new I0 { def I3: I3 = ??? }
}