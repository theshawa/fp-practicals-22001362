class Rational(val n:Int, val d:Int){
  require(d!=0, "Denominator cannot be zero");

  def neg(): Rational = new Rational(-n, d);

  override def toString: String = s"$n/$d";
}

object Q1 extends App {
  val r1 = new Rational(4,6);
  println(r1);
  val r2 = r1.neg();
  println(r2);
}

object Q2 extends App {
  def sub(r1:Rational,r2:Rational):Rational = {
    val cd = if(r1.d==r2.d) r1.d else r1.d*r2.d;
    val n1 = r1.n * (if(r1.d==r2.d) 1 else r2.d);
    val n2 = r2.n * (if(r1.d==r2.d) 1 else r1.d);
    new Rational(n1-n2,cd);
  }

  val x = new Rational(3,4);
  val y = new Rational(5,8);
  val z = new Rational(2,7);

  println(sub(x, sub(y, z)));
}

class Account(val initialBalance:Double=0){
  private var _balance = initialBalance;

  def balance = _balance;

  def withdraw(amount:Double) = {
      _balance-=amount;
  }

  def deposit(amount:Double) = {
    _balance+=amount;
  }

  def tranfer(target:Account, amount: Double) = {
    withdraw(amount);
    target.deposit(amount);
  }

  override def toString():String = s"Account: ${_balance}";
}


object Q3 extends App{
  val ac1 = new Account(200);
  val ac2 = new Account(180);

  ac1.tranfer(ac2,20);

  println(ac1.balance);
  println(ac2.balance);
}

class Bank{
  var _accounts = List.empty[Account];

  def addAccount(acc:Account) = _accounts = _accounts :+ acc;

  def listNegative() = _accounts.filter(_.balance<0)

  def totalBalance() = _accounts.map(_.balance).sum;

  def applyInterest(): List[Account] = {
    _accounts.map{account =>
      if(account.balance>0) account.deposit(account.balance*0.05);
      else account.deposit(account.balance*0.1);
      account;
    }
  }

  def accounts = _accounts;
}

object Q4 extends App {
  val bank = new Bank();
  bank.addAccount(new Account(-50));
  bank.addAccount(new Account(-10));
  bank.addAccount(new Account(50));
  bank.addAccount(new Account(1000));

  println(bank.listNegative());
  println(bank.totalBalance());
  println(bank.applyInterest());
}


object Q5 extends App {
  def countLetterOccurences(words:List[String]):Int = {
    val lengths = words.map(word=>word.length);
    val totalLetterCount = lengths.reduce((acc,current)=>acc+current)
    totalLetterCount;
  }

  val words = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurences(words)

  println(s"Total count of letter occurrences: $totalCount")
}
