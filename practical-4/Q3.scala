object Q3 extends App {

  def toUpper(text:String):String = text.toUpperCase;

  def toLower(text:String):String = text.toLowerCase;

  def formatNames(name:String)(cb: (String)=>String)= cb(name);

  println(formatNames("Benny")(toUpper));
  println(formatNames("Niroshan")(s=>s.substring(0,2).toUpperCase+s.substring(2).toLowerCase));
  println(formatNames("Saman")(toLower));
  println(formatNames("Kumara")(s=>s.dropRight(1)+s.takeRight(1).toUpperCase));
}
