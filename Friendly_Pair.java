import java.util.Scanner;
class Friendly_Pair
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num1 = s.nextInt();
  int num2 = s.nextInt();
  
  int sum1 =0;
  int sum2 =0;
  for(int ctr =1;ctr<num1;ctr++)
  {
   if(num1%ctr ==0)
     sum1 += ctr;
  }
  
  for(int ctr =1;ctr<num2;ctr++)
  {
   if(num2%ctr ==0)
     sum2 += ctr;
  }
  if(num1==sum2 && num2 ==sum1)
    System.out.println("Friendly pair");
 }
}