import java.util.Scanner;
class Automorphic_Number 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
  int num = s.nextInt();
  int sq = num *num;
  int len = Integer.toString(num).length();
  String sqstr = Integer.toString(sq);
  int len1 = sqstr.length();
  int ans =Integer.parseInt(sqstr.substring(len1-len));
  if(ans == num)
  System.out.println("Automorphic number");
  System.out.println("last digits are"+ans);
  
  
  
  }
}