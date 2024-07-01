object Q2 extends App {
  def filter_strings(str_list:List[String]):List[String] = str_list.filter(_.length>5);

  val strings = List("Hello", "Premapala", "Jontyrathne", "Kamal");
  val filtered = filter_strings(strings);
  println(filtered);
}
