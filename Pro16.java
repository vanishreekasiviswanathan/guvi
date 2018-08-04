import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class Pro16
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] ar=new int[n];
 for(int i=0;i<n;i++)
   ar[i]=sc.nextInt();
 int count=1;
 int sum=0;
 int counter=0;
 while(counter<n)
 {
   int min=minValue(ar);
   for(int i=0;i<n;i++)
   {
     if(ar[i]==min)
     {
       sum+=count;
       counter++;
       ar[i]=Integer.MAX_VALUE;
     }
   }
   count++;
 }
 System.out.println(sum);
}
public static int minValue(int[] a)
{
	Arrays.sort(a);
	return a[0];
}
}
