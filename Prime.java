import java.util.Scanner;
class Prime 
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int fact = 0;
  for(int ctr = 1;ctr <=num;ctr++)
  {
    if(num%ctr==0)
      fact++;
    
  }
  if(fact ==2)
    System.out.println("Prime Number");
  else
    System.out.println("Not a prime no ");
 }
}