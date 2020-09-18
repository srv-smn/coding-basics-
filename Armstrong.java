import java.util.Scanner;

class Armstrong 
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int rev = num;
  int arms=0;
  while(num>0)
  {
    int d = num%10;
    num /=10;
    arms = (d*d*d)+arms;
  }
  if(arms == rev)
    System.out.print("Armstrong number");
  else
    System.out.print("Not Armstrong number");
 }
}