object Q3 extends App{
  def arith_mean(n1:Int,n2:Int):Float = BigDecimal(((n1+n2)/2.0)).setScale(2,BigDecimal.RoundingMode.HALF_UP).toFloat;

  val mean = arith_mean(6,5);
  println(f"mean of 4,7 is $mean%.2f");
}
