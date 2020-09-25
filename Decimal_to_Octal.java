
import java.util.Scanner;
class Decimal_to_Octal
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int[] ans = new int[20];
    int l=0;
    while(num>0)
    {
     int d = num%8;
     num = num/8;
     ans[l++] = d;
    }
    for(int ctr =l-1; ctr>=0;ctr--)
      System.out.print(ans[ctr]);
  }
}