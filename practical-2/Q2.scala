object Q2{
  def main(a:Array[String]){
    var (a,b,c,d,k) = (2,3,4,5,4.3f);

    b-=1;
    println(b*a+c*d);
    d-=1;

    
    println(a);
    a+=1;

    println(-2 * (d-k)+c); // d instead of g

    c+=1;
    println(c);

    c+=1;
    println(c*a);
    a+=1;
  }
}
