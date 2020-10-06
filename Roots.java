import java.util.Scanner;
class Roots
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter Cofficient of X^2");
  int a = s.nextInt();
  System.out.println("Enter Cofficient of X");
  int b = s.nextInt();
  System.out.println("Enter constant");
  int c = s.nextInt();
  double r1 = (-b-Math.sqrt((b*b)-4*a*c))/(2*a);
  double r2 = (-b +Math.sqrt((b*b)-4*a*c))/(2*a);
  System.out.println("Roots are "+r1+" and "+r2);
 }
}