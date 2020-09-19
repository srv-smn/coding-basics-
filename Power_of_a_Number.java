import java.util.Scanner;
class Power_of_a_Number
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in); 
  System.out.println("enter the base");
  int base = s.nextInt();
  System.out.println("Enter the exponent");
  int exp = s.nextInt();
  int ans=1 ;
  for(int ctr=1;ctr<=exp;ctr++)
  {
    ans = ans*base;
  }
  System.out.print(base+" to the power "+exp+" is "+ans);
 }
}