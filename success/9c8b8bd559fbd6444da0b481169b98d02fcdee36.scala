class I0 {
def I0(I0: (=> Int) => Unit): Unit =
Console.println(I0.isInstanceOf[Int])
}