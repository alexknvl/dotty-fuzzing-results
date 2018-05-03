class I0 {
class I1 { type I1 }
type I2 <: I1 { type I1 }
type i3 <: I1 { type I1 = I2 }
}