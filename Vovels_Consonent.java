import java.util.Scanner;
class Vovels_Consonent
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  char c = s.next().charAt(0);
  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
  System.out.println("Vowel");
  else
    System.out.println("Consonent");
 }
}