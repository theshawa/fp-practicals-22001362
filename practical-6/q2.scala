import scala.io.StdIn;

object Q2 extends App {
  def validateInput(tup:(String,Int,Int)): (Boolean, Option[String]) = (tup._2 <= tup._3, if(tup._1.trim.isEmpty) None else Some(tup._1.trim))

  def printStudentRecord(tup:(String,Int,Int,Double,Char)){
    println(s"name: ${tup._1}\nmarks: ${tup._2}/${tup._3}(${tup._4}%)\ngrade: ${tup._5}");
  }

  def getStudentInfo():(String,Int,Int,Double,Char) = {
    val name = readLine("Enter name: ");
    print("Enter marks: ");
    val marks = readInt();
    print("Enter total marks: ");
    val totalMarks = readInt();
    val perc = (marks.toFloat / totalMarks.toFloat) * 100.0;
    val grade = if(perc>=90) 'A' else if(perc>=75) 'B' else if(perc>=50) 'C' else 'D';
    (name.trim,marks,totalMarks,perc,grade);
  };

  def getStudentInfoWithRetry():(String,Int,Int,Double,Char)={
    val input = getStudentInfo();
    val validation = validateInput((input._1,input._2,input._3));
    var ok = true;
    if(!validation._1){
      ok = false;
      println("invalid marks entered!");
    }
    if(!validation._2.isDefined){
      ok=false;
      println("invalid name entered!");
    }
    if(!ok) getStudentInfoWithRetry();
    input;
  }

  println(validateInput(("H ",100,100)));
  printStudentRecord(("Hasdi",99,100,99,'A'));
  println(getStudentInfoWithRetry());
}
