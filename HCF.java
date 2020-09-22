import java.util.Scanner;
class HCF
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  int b = s.nextInt();
  int hcf =1;
  for(int ctr=1;ctr<=a && ctr<=b; ctr++)
  {
   if(a%ctr ==0 && b%ctr ==0)
     hcf =ctr;
    
  }
   System.out.println(hcf);
 }
}