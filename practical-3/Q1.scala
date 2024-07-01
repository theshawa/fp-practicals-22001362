object Q1 extends App {
  def reverse_string(str:String):String = str match{
    case "" => str;
    case s => reverse_string(str.tail) + str.head;
  }

  val str = "Hello World";
  printf("reverse of %s is %s\n", str, reverse_string(str));
}
