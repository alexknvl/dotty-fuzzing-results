type Fst[t[_[_, _]]] = t[[a, b] => a]
type Snd[t[_[_, _]]] = t[[a, b] => b]
final case class Witness[t[_[_, _]], A <: Fst[t]](value: Snd[t])