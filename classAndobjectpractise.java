class Employee{
  int EmpId;
  String EmpName;
  double salary;

void display(){
    System.out.println("Employee Id "+EmpId);
        System.out.println("Employee name "+EmpName);
            System.out.println("Employee salary "+ salary);
  }
public static void main(String[]args){
Employee E1 = new Employee();
E1.EmpId = 103;
E1.EmpName = "Raj";
E1.salary = 16799;
E1.display();
}

}