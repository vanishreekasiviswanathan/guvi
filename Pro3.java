import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
public class robo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Character> xy=new HashSet<Character>();
		String x=sc.next().toUpperCase();
		String y=sc.next().toUpperCase();
		int sum=0;
		for(int i=0;i<x.length();i++)
		{
	        int cnt=0;
	         for(int j=0;j<y.length();j++) {
	    	    if(x.charAt(i)==y.charAt(j)) {
	    		  xy.add(x.charAt(i));
	    	            cnt++;
		    }
	        }if(cnt==0)
	         sum+=1;
		}
		System.out.println(sum+y.length()-xy.size());
		sc.close();
	}
}
