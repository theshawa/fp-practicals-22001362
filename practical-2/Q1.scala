object Q1 {
  def main(args: Array[String]) {
    val k,j = 2;
    var i=2;
    val m,n = 5;
    val (f,g,c) = (12.0f,4.0f,'X');

    println(k+12*m);
    println(m/j);
    println(n%j);
    println(m/j*j);
    println(f+10*5+g);
    println(++i*n); // err
  }
}
