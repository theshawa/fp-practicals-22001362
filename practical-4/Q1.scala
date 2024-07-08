object Q1 extends App {
  val names:Array[String] = Array("Mouse","Keyboard","Monitor","Speaker");
  val quantities:Array[Int] = Array(1,0,2,5);


  def printItems(i:Int=0){
    printf("%s -> %s\n",names(i),quantities(i));
    if(i+1<names.length){
      printItems(i+1);
    }
  }

  def reStockItem(name:String,qty:Int,i:Int=0):Unit = i match{
    case i if(i>names.length-1) =>println("Invalid item");
    case i if(names(i)==name) => quantities(i)=qty;
    case _ => reStockItem(name,qty,i+1);
  }

  printItems();

  reStockItem("Speakers",2);

  printItems();
}
