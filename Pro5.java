import java.lang.*;
import java.util.Scanner;
public class Pro5
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int x=sc.nextInt();
     int y=sc.nextInt();
     if((int)(n/2)%(x+y)==0)
       System.out.println("YES");
       else
         System.out.println("NO");
  }
}
