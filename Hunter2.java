import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class Hunter2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++)
			num[i]=sc.nextInt();
		Arrays.sort(num);
		for(int i=n-1;i>=0;i--)
			str+=num[i];
		System.out.println(str);
	}
}
