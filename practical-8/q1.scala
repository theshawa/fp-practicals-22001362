object Q1 extends App {
  val alphabetStartCapital = 65;
  val alphabetStartSimple = 97;
  val alphabetLength = 26;

  def getShiftedChar(char:Char,shift:Int):Char = char.toInt match {
    case x if(x>=alphabetStartCapital && x<alphabetStartCapital+alphabetLength) => {
      var newCode = x+shift;
      if(newCode<alphabetStartCapital) newCode+=alphabetLength;
      if(newCode>=alphabetStartCapital+alphabetLength) newCode-=alphabetLength;
      newCode.toChar;
    }
    case x if(x>=alphabetStartSimple && x<alphabetStartSimple+alphabetLength) => {
      var newCode = x+shift;
      if(newCode<alphabetStartSimple) newCode+=alphabetLength;
      if(newCode>=alphabetStartSimple+alphabetLength) newCode-=alphabetLength;
      newCode.toChar;
    }
    case _ => ' ';
  }

  def caesar_encrypt(text:String,key:Int=1):String = {
    if(text.isEmpty) text;
    else getShiftedChar(text.head, key) + caesar_encrypt(text.tail,key);
  }

  def caesar_decrypt(encrypted:String,key:Int=1):String = {
    if(encrypted.isEmpty) encrypted;
    else getShiftedChar(encrypted.head, -key) + caesar_decrypt(encrypted.tail,key);
  }

  def caesar_cipher(fn:(String,Int)=>String,text:String,key:Int):String = fn(text,key);

  val originalString = "Theshawa+Dasun";
  val key = 3;
  println(s"original string: ${originalString}, key: ${key}");
  val encrypted = caesar_cipher(caesar_encrypt, originalString, key);
  println(s"encrypted: ${encrypted}");
  val decrypted = caesar_cipher(caesar_decrypt, encrypted,key);
  println(s"decrypted: ${decrypted}");
}
