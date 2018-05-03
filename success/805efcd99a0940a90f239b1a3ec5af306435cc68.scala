class I0 {
def I1(I1: (=> Int) => Unit): Unit =
Console.println(I1.isInstanceOf[Int])
}