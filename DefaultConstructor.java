class Laptop{
  String model;
  String Brand;
  int ram;
  int storage;

  Laptop(){
    model = "HP";
    Brand = "Abc";
    ram = 8;
    storage = 256;

  }
void display(){
  System.out.println("Model "+model);
   System.out.println("Brand "+Brand);
    System.out.println("Ram "+ram);
     System.out.println("Storage "+storage);
}
public static void main(String[]args){
  Laptop L1 = new Laptop();
  L1.display();
}
}
