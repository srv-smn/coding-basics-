import java.util.Scanner;
class Fibonacci
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int limit = s.nextInt();
  int a =0;
  int b =1;
  System.out.println(a);
  System.out.println(b);
  while(b<=limit)
  {
    int temp = a;
    a= b;
    b= b+temp;
    if(b<=limit)
    System.out.println(b);
  }
 }
}