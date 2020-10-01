import java.util.Scanner;
class Prime_Between
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int a=2,b=100;
  for(;a<b;a++)
  {
   int fact=0;
     for(int ctr=2;ctr<a;ctr++)
   {
    if(a%ctr==0)
    {
     fact++;
     break;
    }
   }
   if(fact==0)
     System.out.print(" "+a);
  }
  System.out.println();
 }
}