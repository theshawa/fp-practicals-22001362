object Q4 extends App{
  def sum_of_list(int_list:List[Int]):Int = int_list match{
    case lst if lst.isEmpty => 0;
    case _ => sum_of_list(int_list.tail) + (int_list.head match{
      case x if x%2==0 => x;
      case _ => 0;
    });
  };

  val int_list = List(1,2,3,4,5);
  val sum = sum_of_list(int_list);
  println(s"sum of even in $int_list is $sum");
}
