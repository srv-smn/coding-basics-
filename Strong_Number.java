import java.util.Scanner;
class Strong_Number
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int sum =0;
  int temp = num;
  int fact =0;
  while(temp >0)
  {
    int d = temp%10;
    temp /=10;
    fact =1;
    for(int ctr=1;ctr<= d;ctr++)
    {
      fact = fact *ctr;
    }
    sum = sum+fact;  
  }
  System.out.println("sum is "+sum);
  if(sum == num)
    System.out.println("strong number");
  
 }
}