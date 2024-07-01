object Q4 extends App{
  def sum_of_list(int_list:List[Int]):Int = int_list match{
    case lst if lst.length==1 => int_list(0);
    case _ => sum_of_list(int_list.tail) + int_list.head;
  };

  val int_list = List(1,2,3,4,5);
  val sum = sum_of_list(int_list);
  println(s"sum of $int_list is $sum");
}
