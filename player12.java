import java.lang.*;
import java.util.Scanner;
public class Player12
{
 public static void main(String[] args)
 { 
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] a=new int[n];
   int k=sc.nextInt();
   for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
     if(n>1){
   for(int i=0;i<k;i++)
   {
     for(int j=n-1;j>0;j--)
     {
       int t=a[j];
       a[j]=a[j-1];
        a[j-1]=t;
     }
   }
   for(int i=0;i<n;i++)
     System.out.print(a[i]+" ");
   }
   else
      for(int i=0;i<n;i++)
     System.out.print(a[i]+" ");
 }
}
