import java.util.*;
class Sum_of_numbers_in_Range
{
 public static void main(String args[]) 
 {
  Scanner s = new Scanner(System.in);
  System.out.println("enter initial range");
  int i = s.nextInt();
  System.out.println("enter the extreme range");
  int n = s.nextInt();
  int sum = 0;
  if(i<=n)
    for(int ctr=i;ctr<=n;ctr++)
    sum = sum + ctr;
  System.out.println("The sum is "+sum);
 }
}