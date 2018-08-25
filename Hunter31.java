import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Hunter31{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> alist=new ArrayList<Integer>();
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		for(int j=0;j<ar.length;j++)
		{
			int product=1;
			for(int k=j;k<n;k++)
			{
				product=product*ar[k];
				alist.add(product);
			}n--;
		}
		Collections.sort(alist);
		System.out.println(alist.get(alist.size()-1));
		sc.close();
	}
}
