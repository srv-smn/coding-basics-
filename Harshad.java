import java.util.Scanner;

class Harshad
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int sum =0;
  int temp = num;
  while(temp >0)
  {
   int d = temp%10; 
   temp /= 10;
   sum = sum+d;
  }
   if(num%sum ==0)
     System.out.println("number is harshad");
   
 }
  
}