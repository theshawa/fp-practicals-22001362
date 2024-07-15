object Q1 extends App {
  def getProductList(i:Int=0): List[String] = {
    print(s"Enter item ${i+1}: ");
    val input = scala.io.StdIn.readLine();
    if(input=="done") List();
    else List(input) ::: getProductList(i+1);
  }

  def printProductList(items:List[String], i:Int=0):Unit = i match {
    case x if(x < items.length) => {
      printf(s"${i+1}. %s\n",items(i));
      printProductList(items, i+1);
    }
    case _ => {}
  }

  def getTotalProducts(items:List[String]) = items.length;

  val items = getProductList();
  printProductList(items);
  val total = getTotalProducts(items);
  println(s"Total products: ${total}");
}
