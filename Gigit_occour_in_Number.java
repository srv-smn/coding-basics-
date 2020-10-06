import java.util.Scanner;
class Gigit_occour_in_Number
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  System.out.println("enter the number");
  int num = s.nextInt();
  System.out.println("enter the finding digit");
  int x = s.nextInt();
  int temp = num;
  int count =0;
  while(num>0)
  {
   int d = num%10;
   num = num/10;
   if(d==x)
     count++;
  }
  System.out.println(x+" occoured "+count+" times in "+temp);
 }
}