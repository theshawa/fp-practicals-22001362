object Q3 extends App {
  def isPrime(n:Int,i:Int=2):Boolean = n match{
    case x if(x<=2) => x==2;
    case x if(x%i==0) => false;
    case x => {
      if(i*i>n) true;
      else isPrime(n,i+1);
    }
  }

  def filterPrime(items:List[Int]):List[Int] = items.filter(item=>isPrime(item));

  val items = List(1,2,3,4,5,6,7,8,9,10);

  println(filterPrime(items));

}
