sealed trait I0
sealed abstract class I1
trait I2[+I1, +I2[I3]](I3: I1)