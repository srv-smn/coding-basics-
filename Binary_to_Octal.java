import java.util.Scanner;
// https://www.tutorialspoint.com/how-to-convert-decimal-to-octal
class Binary_to_Octal 
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int decimal =0;
  int a =0;
  while(num >0)
  {
   int d = num%10;
   decimal += d*Math.pow(2,a);
   a++;
   num /=10;
  }
  int l=0;
  int octal[] = new int[20];
  while(decimal>0)
  {
   int r = decimal%8;
   octal[l++] = r;
   decimal = decimal/8;
  }
  for(int j =l-1;j>=0;j--)
    System.out.print(octal[j]);
 }
}