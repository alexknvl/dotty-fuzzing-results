trait I0 {
val I0: Int =
(null: Any) match {
case _: Some[I0] => I0
case 1 => 1
case i1 =>  + I0
}
println(I0)
}