import java.util.Scanner;
class Palindrome {
 public static void main(String[] args)
 {
   Scanner s = new Scanner(System.in);
   String str = s.nextLine();
   int len = str.length();
   char[] chr = new char[len];
   int loc =0;
   for(int ctr=len-1; ctr>=0;ctr--)
   {  
  
    chr[loc] = str.charAt(ctr); 
    loc++;  
   }
   String palin = new String(chr);
   if(palin.equals(str))
     System.out.println("Palindrome");
   else
     System.out.println("not Palindrome");
 }
}