import java.util.Scanner;

class Binary_to_Decimal 
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  double decimal =0;
  int a =0;
  while(num>0)
  {
    int d = num%10;
    num=num/10;
    decimal = decimal + (d*Math.pow(2,a));
    a++;
  }
  System.out.println("decimal is "+(int)decimal);
 }
}