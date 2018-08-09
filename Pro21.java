import java.lang.*;
import java.util.Scanner;
public class Pro21{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
  a[i]=sc.nextInt();
System.out.println((getAverage(a,0,n/2)==getAverage(a,n/2,n))?"yes":"no");
  sc.close();
}
public static int getAverage(int[] ar,int m,int r)
{
	int sum=0;
	int avg=0;
	int count=0;
	for(int i=m;i<=r-1;i++) {
	  sum+=ar[i];
	  count+=1;
	}
	avg=sum/count;
	return avg;
}
}
