import java.lang.*;
import java.util.Scanner;
public class Beginner24
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++)
  m[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	for(int j=i+1;j<n;j++)
		if(m[i]>m[j])
		   {
        int temp=m[i];
		    m[i]=m[j];
		    m[j]=temp;}
	System.out.println(m[i]);
	}
 sc.close();
}
}
