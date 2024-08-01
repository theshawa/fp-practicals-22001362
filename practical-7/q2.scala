object Q2 extends App {

  def calculateSquare(items:List[Int]):List[Int] = items.map(item=>item*item);

  val items = List(1,2,3,4,5);

  println(calculateSquare(items));

}
