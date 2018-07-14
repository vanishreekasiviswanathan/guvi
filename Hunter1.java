import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
public class Hunter1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		HashSet<Integer> H1=new HashSet<Integer>();
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
		      if(num[i]==num[j])
		    	  count++;
			}
			if(count>1) 
				H1.add(num[i]);
		}
		for(Integer i:H1)
			System.out.print(i+" ");
		if(H1.size()==0)
			System.out.println("unique");
		sc.close();
	}
}
