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
	  int len=a.length-1;
    for(int j=0;j<=a.length-1;j++)
    {
    	int sum=0;
    	for(int k=j;k<=len;k++)
    	{
    		sum+=a[k];
    		al.add(sum);
    	}len--;
    }
  Collections.sort(al);
  System.out.println(al.get(al.size()-1));
  sc.close();
}
}
