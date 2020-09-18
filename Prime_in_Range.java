import java.util.Scanner;
class Prime_in_Range
{
  public static void main(String[] args)
  {
  Scanner s = new Scanner(System.in);
  int start = s.nextInt();
  int stop = s.nextInt();
  int[] prime = new int[stop-start];
  int count =0;
  int fact =0;

  for(int ctr1 = start; ctr1<= stop; ctr1++)
  {
    fact=0;
    for(int ctr2= 1;ctr2 <= ctr1;ctr2++)
    {
      if(ctr1%ctr2==0)
      fact++;
    }
    if(fact ==2)
    {
      prime[count]=ctr1;
      count++;
    }
  }
    for(int a :prime){
      if(a!=0)
      System.out.println(a+" is prime");
    }
  }
}