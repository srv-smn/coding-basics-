import java.util.Scanner;

class LCM
{
 public static void main(String[] args)
 {
   Scanner s= new Scanner(System.in);
   int a = s.nextInt();
   int b = s.nextInt();
   int small = a>b?b:a;
   int lcm=0;
   
   for(int ctr = small ;ctr <= a*b;ctr = ctr+small)
   {
     if(ctr%a==0 && ctr%b==0)
     {
       lcm=ctr; 
       break;
     }
   }
   System.out.println(lcm);
 } 
}