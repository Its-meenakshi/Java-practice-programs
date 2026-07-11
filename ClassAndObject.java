class Student {
String name;
int rollno;
void display(){
System.out.println("name "+ name);
System.out.println("roll no "+ rollno);
}
public static void main(String[]args){
  Student s1 = new Student();
  s1.name = "amit";
  s1.rollno = 56;
  s1.display();

}
}
