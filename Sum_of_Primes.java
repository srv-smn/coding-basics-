import java.util.Scanner;
class Sum_of_Primes
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int a=0,b=0;
  for(int ctr =1;ctr<num;ctr++)
  {
    if(Prime(ctr))
    {
     if(Prime(num-ctr))
     {
       a= ctr;
       b=num-ctr;
       break;
     }
    }
  }
  if(a!=0&&b!=0)
  {
    System.out.println("Sum of "+num+"in terms of prime number is "+a+" + "+b);
  }
  else
  System.out.println("No prime sum");
 }
 public static boolean Prime(int n)
 {
   boolean res = true;
   for(int ctr = 2;ctr<n;ctr++)
   {
    if(n%ctr==0)
    {
     res=false;
     return res;
    }
   }
   return res;
 }
}