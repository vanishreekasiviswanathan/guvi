import java.lang.*;
import java.util.Scanner;
public class Hunter26
{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] a=new int[n];
   for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
   for(int i=0;i<n;i++)
   {
      if(i!=n-1)
         System.out.print(a[i]+"->");
      else
         System.out.print(a[i]);
   }
}
}