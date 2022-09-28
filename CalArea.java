import java.util.Scanner;
class Area
{
 void calArea(int x)
 {
  System.out.println("Area of square: "+(x*x));
 }
 void calArea(int l,int b)
 {
  int a;
  a = l*b;
  System.out.println("Area of rectangle: "+(l*b));
 }
 void calArea(float r)
 {
  System.out.println("Area of cirlcle: "+(3.14*r*r));
 }
}
class CalArea
{
 public static void main(String args[])
 {
  int s;
  Area a1 = new Area();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter side of square");
  s = sc.nextInt();
  a1.calArea(s);
  a1.calArea(4,8);
  
 }
}
/*
Output:
java CalArea
Enter side of square:
5
Area of square: 25
Area of rectangle: 32
*/