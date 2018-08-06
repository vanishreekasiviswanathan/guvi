import java.util.Scanner;
import java.lang.*;
public class Pro11
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  long num=sc.nextLong();
  long ans=1;
  for(long i=0;i<num-1;i++)
  {
    ans=ans*i;
  }
  System.out.println(ans);
}
}
