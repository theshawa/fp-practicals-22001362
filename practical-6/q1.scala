case class Item(name:String,quantity:Double,price:Double);

object Q1 extends App {
  def retrieveNames(inv:Map[String,Item]): List[String] = {
    var names = List[String]();
    inv.foreach((e) => names = names :+ e._2.name)
    names;
  }

  def calculateTotalValue(inv:Map[String,Item]): Double = {
    var sum:Double = 0;
    inv.foreach((e) => sum += e._2.quantity * e._2.price)
    sum;
  }

  def checkIfIsEmpty(inv:Map[String,Item]): Boolean = inv.isEmpty;

  def merge(inv1:Map[String,Item],inv2:Map[String,Item]):Map[String,Item] = {
    var newInv = Map[String,Item]();
    inv2.foreach((e) => inv1.get(e._1) match{
      case Some(x) => {
        val item = Item(x.name,x.quantity+e._2.quantity,if(x.price>e._2.price) x.price else e._2.price);
        newInv += e._1 -> item;
      }
      case _ => {
        newInv += e._1 -> e._2;
      }
    })
    newInv;
  }

  def checkIfExists(inv:Map[String,Item],id:String) {
    inv.get(id) match {
      case Some(item) => println(s"${item.name}: qty=${item.quantity}, price=${item.price}");
      case _ => {}
    }
  }

  val inv1: Map[String,Item] = Map("102"->Item("abc",12,123.5));
  val inv2: Map[String,Item] = Map("102"->Item("abc",14,125.5));

  println(retrieveNames(inv1));
  println(calculateTotalValue(inv1));
  println(checkIfIsEmpty(inv1));
  println(merge(inv1,inv2));
  checkIfExists(inv1,"102");
}
