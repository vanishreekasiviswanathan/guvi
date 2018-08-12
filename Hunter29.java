import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Hunter29
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] a=new int[n];
  for(int i=0;i<n;i++)
	  a[i]=sc.nextInt();
  ArrayList<Integer> al=new ArrayList<Integer>();
  for(int i=n-1;i>=0;i--)
  {
	  int len=i;
    for(int j=0;j<=i;j++)
    {
    	int sum=0;
    	for(int k=j;k<=len;k++)
    	{
    		sum+=a[k];
    		al.add(sum);
    	}len--;
    }
  }
  Collections.sort(al);
  System.out.println(al.get(al.size()-1));
  sc.close();
}
}
