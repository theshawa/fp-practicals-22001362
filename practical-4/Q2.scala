object Q2 extends App{
  printf("Enter number: " );
  scala.io.StdIn.readInt() match{
    case x if(x<=0) => println("Negative/Zero");
    case x if(x%2==0) => println("Even number is given");
    case _ => println("Odd number is given");
  }
}
