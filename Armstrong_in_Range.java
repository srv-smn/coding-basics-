import java.util.Scanner;
class Armstrong_in_Range
{
 public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);
   int start = s.nextInt();
   int stop = s.nextInt();
   for(int ctr =start;ctr <= stop ;ctr++)
   {
    int sum =0;
    int num = ctr;
    while(num >0)
    {
      int d = num %10;
      num = num/10;
      sum = (d*d*d)+sum;
    }
    if(sum == ctr)
      System.out.println(ctr +" is palindrome");
   }
 }
  
}