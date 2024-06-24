object Q4{
  def main(args:Array[String]){
    val ticket_price = 24.0f;
    printf("profit for %.2f is %.2f\n",ticket_price,profit(ticket_price));
  }

  def profit(ticket_price:Double):Double = total_income(ticket_price) - total_cost(ticket_price);

  def cost_for_attendees(no:Int):Double = no * 3;
  def cost_for_show = 500;
  def total_cost(ticket_price:Double):Double = cost_for_attendees(no_att(ticket_price)) + cost_for_show;

  def total_income(ticket_price:Double):Double = no_att(ticket_price) * ticket_price;

  def no_att(ticket_price:Double):Int = (120 - 20 * (ticket_price-15)/5).toInt;
}
