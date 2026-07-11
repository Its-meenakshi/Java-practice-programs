 class Area{
  double Calculate(double side){
    return side *side;
  }
double Calculate(double length,double breath){
  return length * breath;
}
double Calculate(double radius, boolean isCircle){
  return Math.PI *radius*radius;
}
public static void main(String[] args) {
  Area A1 = new Area();
  System.out.println("Area of the square " + A1.Calculate(5));
  System.out.println("Area of the Rectangle " + A1.Calculate(2,5));
  System.out.println("Area of the Circle " + A1.Calculate(3,true));
  


}
 }