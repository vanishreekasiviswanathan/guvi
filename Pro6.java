import java.lang.*;
import java.util.Scanner;
public class Pro6{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int count=0;
  int n=sc.nextInt();
  int[] ar=new int[n];
  for(int i=0;i<n;i++)
    ar[i]=sc.nextInt();
  for(int i=0;i<n-2;i++)
  {
   for(int j=i+1;j<n-1;j++)
   {
   for(int k=j+1;k<n;k++)
     if(ar[i]<ar[j] && ar[j]<ar[k])
        count++;
    }
  }
  System.out.println(count);
}
}
