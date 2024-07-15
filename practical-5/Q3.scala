object Q3 extends App {
  def nth_fibonacci(n:Int):Int = n match {
    case x if(x<=1) => x;
    case _ => nth_fibonacci(n-2) + nth_fibonacci(n-1);
  }

  def fibonacci(n:Int,i:Int = 0):Unit = i match{
    case x if(x<=n) => {
      printf("%d ", nth_fibonacci(i));
      fibonacci(n,i+1);
    }
    case _ => {}
  }

  fibonacci(10);
  println();
}
