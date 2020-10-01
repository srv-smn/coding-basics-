import java.util.Scanner;
class Character_or_Not
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  char c = s.next().charAt(0);
  if(c>='a'&&c<='z'||c>='A'&&c<='Z')
  System.out.println("Character");
  else
    System.out.println("Not Character");
 }
}