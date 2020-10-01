import java.util.Scanner;
class Replace_all_0_with_1
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int len = String.valueOf(num).length();
  int arr[] = new int[len];
  int i = len-1;
  while(num>0)
  {
    int d = num%10;
    if(d==0)
      d=1;
    num = num/10;
    arr[i--]=d;
  }
   for(int a:arr)
  System.out.print(a);
 }
}