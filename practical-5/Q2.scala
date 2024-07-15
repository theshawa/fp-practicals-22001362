import scala.collection.mutable.Set;

case class Book(var title:String, var author:String, var isbn:String);

object Q2 extends App {
  var books = Set(
    Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"),
    Book("1984", "George Orwell", "978-0-452-28423-4"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5")
  );

  def addNewBook(title:String, author:String, isbn:String) = books.add(Book(title,author,isbn));
  def removeBook(isbn:String) = books.retain(_.isbn!=isbn);
  def checkBook(isbn:String) = books.find(_.isbn==isbn).isDefined;
  def printBook(book:Book) = printf(
        s"Title: %s\nAuthor: %s\nISBN: %s\n\n",
        book.title, book.author, book.isbn
      );

  def displayCollection() = books.foreach(printBook(_));
  def searchBookByTitle(query:String){
    val book = books.find(_.title==query);
    if(book.isDefined) printBook(book.get);
    else println("not found");
  }
  def displayBooksByAuthor(author:String) =
    books.foreach(book=>if(book.author==author) printBook(book));


  addNewBook("Test","test","1234");
  println(checkBook("1234"));
  removeBook("1234");
  println(checkBook("123"));

  displayCollection();

  searchBookByTitle("1984");
  displayBooksByAuthor("George Orwell");
}
/*
val book = books(i);
      printf(
        s"Book ${i+1}:\nTitle: %s\nAuthor: %s\nISBN: %s\n",
        book.title, book.author, book.isbn
      );

 */
