object Q3{
  def main(args:Array[String]){
    printf("Take home salary(per week) of a typical employee: %.2f\n",take_home_salary()); 
  }

  def pay_for_normal_hrs(hrs:Int) = hrs * 250;
  def pay_for_ot_hrs(hrs:Int) = hrs * 85;
  def tax(total:Int):Double = total * 0.12;
  def take_home_salary(nor_hrs:Int=40,ot_hrs:Int=30):Double = {
    val total = pay_for_normal_hrs(nor_hrs) + pay_for_ot_hrs(ot_hrs);
    total - tax(total)
  }
}
