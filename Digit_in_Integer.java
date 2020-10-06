import java.util.Scanner;
class Digit_in_Integer
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int len = 0;
  while(num>0)
  {
   int d = num%10;
   num = num/10;
   len++;
  }
  System.out.println("No. of digits in an Integer is "+len);
 }
}