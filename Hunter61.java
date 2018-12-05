import java.util.Scanner;
public class Hunter61 {
	public static int minDistance(int[] ar,int len,int n2,int i2)
	{
		int count=0;
		for(int i=i2+1;i<len;i++)
		{
			if(ar[i]!=n2)
				count++;
			else 
				return count+1;
		}
		return Integer.MAX_VALUE;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
			int[] a=new int[n];
			int min1=0,min2=0;
	for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==x && !flag) {
				min1=minDistance(a,n,y,i);
				flag=true;
			}
			if(a[i]==y)
				min2=minDistance(a,n,x,i);
		}
		if(x==y && min1==Integer.MAX_VALUE && min2==Integer.MAX_VALUE)
		{
			System.out.println("0");
			System.exit(0);
		}
		System.out.println((min1>min2)?min2:min1);
			sc.close();
	}
}
