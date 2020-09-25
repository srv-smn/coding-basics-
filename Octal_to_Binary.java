import java.util.Scanner;
class Octal_to_Binary
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int decimal =0;
  int l =0;
  while(num>0)
  {
    int d = num%10;
    decimal += d*Math.pow(8,l);
    num/=10;
    l++;   
  }
  l=0;
  int binary[] = new int[20];
  while(decimal>0)
  {
   int d = decimal%2;
   decimal/=2;
   binary[l++]=d;
  } 
  for(int ctr=l-1;ctr>=0;ctr--)
    System.out.print(binary[ctr]);
 }
}
