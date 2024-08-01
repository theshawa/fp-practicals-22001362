object Q1 extends App {

  def filterEvenNumbers(items:List[Int]):List[Int] = items.filter(item=>item%2==0);

  val items = List(1,4,2,5,6,7,9,11,19,24,25);

  println(filterEvenNumbers(items));

}
