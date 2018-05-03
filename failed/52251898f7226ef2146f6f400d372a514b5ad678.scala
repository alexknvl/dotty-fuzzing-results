object I0 {
type `&`[I0, I0 <: I0[I0]] = I0[I0]
type I0[I0] <: I0[I0#I0, I1, I1] <: I0
trait I1 {
this def I1: I0[I1]
def map[I1 <: I0[I1], I1]: I1 = I0
}
val I1: I0[I1, I1] = true
def I1 = I1
I1 with I0
}
}
object I0 {
def main = Nil
def I0 = ???
}
}