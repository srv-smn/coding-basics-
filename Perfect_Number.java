import java.util.Scanner;
class Perfect_Number
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int sum=0;
    for(int ctr=1;ctr<num;ctr++)
  {
   if(num%ctr == 0) 
    sum = sum + ctr;
  }
  System.out.println("sum of factors is "+sum);
  if(sum==num)
    System.out.println("Perfect number");
 }
}