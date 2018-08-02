import java.lang.*;
import java.util.Scanner;
public class Beginner12{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   StringBuilder sb=new StringBuilder(""+n);
   sb.reverse();
   if((""+n).equals(sb.toString()) )
      System.out.println("YES");
   else
      System.out.println("NO");
}
}
