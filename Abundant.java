import java.util.Scanner;

class Abundant 
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int sum =0;
  for(int ctr =1; ctr<num;ctr++)
  {
    if(num%ctr ==0)
      sum = sum+ctr;
  
  }
  if(sum > num)
    System.out.println("Abundant number");
 }
}