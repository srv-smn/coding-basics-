import java.util.Scanner;
class Permutation
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  int r = s.nextInt();
  if(n>=r)
  {
    int numerator = fact(n);
    int demoninator = fact(n,r);
    System.out.println("num"+numerator);
    System.out.println("demo"+demoninator);
    int ans = numerator/demoninator;
    System.out.println("permutation is "+ans);
  }
  else
  System.out.println("Invalid input");
 }
 public static int fact(int num)
 {
  int ans =1;
  for(int ctr =1;ctr<=num;ctr++)
  {
   ans = ans*ctr; 
  }
  return ans;
 }
 public static int fact(int n, int r)
 {
   int ans =1;
   for(int ctr =1;ctr <= n-r;ctr++)
   {
     ans = ans*ctr;
   }
   return ans ;
 }
}