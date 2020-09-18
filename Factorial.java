import java.util.Scanner;
class Factorial 
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int fact = 1;
  for(int ctr =1; ctr<=num;ctr++)
  {
    fact = fact * ctr ;
  }
  System.out.println("The dactorial is "+fact);
 }
}