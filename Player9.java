import java.lang.*;
import java.util.Scanner;
public class Player9
{
public static void main(String[] arg)
{
  Scanner sc=new Scanner(System.in);
  int l=sc.nextInt();
  int r=sc.nextInt();
  int count=0;
  for(int i=l;i<=r;i++)
  {
  boolean p=true;
 loop: for(int j=2;j<=Math.sqrt(i);j++)
    {
        if(i%j==0)
        {
           p=false;
           break loop;
        }
    }
    if(p)
      count++;
  }
  System.out.println(count);
}
}

