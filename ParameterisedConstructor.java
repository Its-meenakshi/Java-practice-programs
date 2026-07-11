class Book{
  String Bookname;
  String Auther;
  int releaseDate;

  Book(String B,String A, int r ){
    Bookname = B;
    Auther = A;
    releaseDate = r;
  }
void display(){
  System.out.println("Bookname "+Bookname);
  System.out.println("Auther "+Auther);
  System.out.println("Release Date "+releaseDate);

}
public static void main(String[]args){
Book B1 = new Book("Verity", "Collen hoover", 2025);
B1.display();

}
}
