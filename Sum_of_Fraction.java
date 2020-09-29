import java.util.Scanner;
class Sum_of_Fraction
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  int b = s.nextInt();
  int c = s.nextInt();
  int d = s.nextInt();
  int deno = LCM(b,d);
  int num1 = (deno/b)*a;
  int num2 = (deno/d)*c;
  System.out.println("num1 "+num1);
  System.out.println("num2 "+num2);
  int numerator = num1+num2;
  int small = numerator>=deno?deno:numerator;
  System.out.println("Numerator"+numerator);
  System.out.println("LCM"+deno);
  for(int ctr = 2; ctr<= small;ctr++)
  {
   if(numerator%ctr ==0 & deno%ctr ==0 )
   {
     numerator = numerator/ctr;
     deno = deno/ctr;
     ctr--;
   }
   System.out.println("value of ctr is "+ctr);
  }
  System.out.println("sum is"+numerator+"/"+deno);
 }
 public static int LCM(int x,int y)
 {
   int small = x>=y?y:x;
   int lcm = x*y;
  for(int ctr=small; ctr <= x*y;ctr +=small) 
   {
    if(ctr%x==0 & ctr%y==0)
    {
      lcm = ctr;
      break;
    }
   }
  return lcm;
 }
}