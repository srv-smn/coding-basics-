import java.util.Scanner;
class Reverse_Number
{
 public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);
   int num = s.nextInt();
   int rev =0;
   while(num > 0)
   {
     int d = num%10;
     num = num /10;
    rev = (rev*10)+ d;
   }
   System.out.println("Reverse is " +rev);
 }
}