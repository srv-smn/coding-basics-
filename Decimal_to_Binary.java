import java.util.Scanner;
class Decimal_to_Binary
{
 public static void main(String[] args)
 {
 Scanner s = new Scanner(System.in);
 int num = s.nextInt();
 int binary[] = new int[20];
 int l=0;
 while(num>0)
 {
  int r = num%2;
  binary[l++]= r;
  num = num/2;
 }
 for(int ctr=l-1;ctr>=0;ctr--)
   System.out.print(binary[ctr]);
 }
}