import java.util.Scanner;
class counting_no_ofdays_in_month
{
 public static void main(String[] args)
 {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter Year");
  int year = s.nextInt();
  System.out.println("Enter Month");
  int month = s.nextInt();
  int days[] = {31,28,31,30,31,30,31,30,31,30,31,30,31};
  if((year%4==0 && year%100!=0)||(year%4==0 && year%400==0))
  days[1]=29;
  System.out.println("Total days in the month is "+days[month-1]);
 }
}