import java.util.Scanner;
class Octal_to_Decimal
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int decimal=0;
  int a =0;
  while(num>0)
  {
   int d =num%10;
   num/=10;
   decimal += d*Math.pow(8,a++); 
   
  }
  System.out.println("decimal "+decimal);
 }
}