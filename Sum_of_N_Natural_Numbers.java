import java.util.*;
class Sum_of_N_Natural_Numbers
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  int sum = 0;
  for(int ctr =1;ctr<=n;ctr++)
  {
  sum = sum + ctr;
  }
  System.out.println("Sum is "+sum);
 }
}