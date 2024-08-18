object Q1 extends App {
  val rate = (amount:Double)=> amount match {
    case x if(x>2000000) => 6.5/100
    case x if(x>200000) => 3.5/100
    case x if(x>20000) => 4/100
    case _ => 2/100
  };

  val interest = (amount:Double) => rate(amount) * amount;
  println(interest(344555));
}

object Q2 extends App {
  val getInput = ()=>{
    print("Enter int: ");
    scala.io.StdIn.readInt();
  }

  val getMessage = (i:Int) => i match{
    case x if(x<1) => "Negative/Zero"
    case x if(x%2==0) => "Even"
    case _ => "Odd"
  }

  val patternMatching = ()=>println(getMessage(getInput()));

  patternMatching();
}

object Q3 extends App {
  def toUpper(s:String) = s.toUpperCase();
  def toLower(s:String) = s.toLowerCase();
  def toUpperFirst2(s:String) = toUpper(s.slice(0,2)) + s.slice(2,s.length);
  def toUpperLast(s:String) = s.slice(0,s.length-1) + toUpper(s.slice(s.length-1,s.length));
  def formatNames(name:String)(fn:(String)=>String) = fn(name);

  println(formatNames("Benny")(toUpper));
  println(formatNames("Niroshan")(toUpperFirst2));
  println(formatNames("Saman")(toLower));
  println(formatNames("Kumara")(toUpperLast));

}
