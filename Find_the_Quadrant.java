import java.util.Scanner;
class Find_the_Quadrant
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  int x = s.nextInt();
  int y = s.nextInt();
  if(x==0)
    System.out.println("Lies on Y axis");
  else if(y==0)
    System.out.println("Lies on X axis");
  else if(x>0&&y>0)
    System.out.println("Lies in first Quadrant");
  else if(x<0&&y>0)
    System.out.println("Lies in second Quadrant");
  else if(x<0&&y<0)
    System.out.println("Lies in third Quadrant");
  else if(x>0&&y<0)
    System.out.println("Lies in fourth Quadrant");  
 }
}