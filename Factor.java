import java.util.Scanner;
class Factor
{
 public static void main(String[] args) 
 {
  Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  System.out.println("Factors for "+num+" are : ");
  for(int ctr =1; ctr<=num;ctr++)
  {
   if(num%ctr == 0)
     System.out.println(ctr);
    
  }
  
 }
}