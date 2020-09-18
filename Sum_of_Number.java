import java.util.Scanner;
class Sum_of_Number
{
 public static void main(String[] args) 
 {
   Scanner s = new Scanner(System.in);
   int num = s.nextInt();
   int sum =0;
   
   while(num > 0)
   {
    int d = num % 10;
    num = num/10;
    sum = sum +d;
   }
   System.out.println("Sum of digits is "+sum);
 }
}