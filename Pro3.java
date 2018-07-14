import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
public class Pro3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="",st="";
		HashSet<Character> xy=new HashSet<Character>();
		String x=sc.next().toUpperCase();
		String y=sc.next().toUpperCase();
		int sum=0;
		for(int i=0;i<x.length();i++)
		{int cnt=0;
	      for(int j=0;j<y.length();j++) {
	    	  if(x.charAt(i)==y.charAt(j)) {
	    		  xy.add(x.charAt(i));
	    	  cnt++;}
	      }if(cnt==0)
	      str+=x.charAt(i);
		}
		for(Character c:xy) {
			st+=(char)c;
		}
		sum+=str.length();
		int count=0;
		for(int i=0;i<st.length();i++) {
		loop:for(int j=0;j<y.length();j++) {
		    	  if(st.charAt(i)==y.charAt(j)) {
		    	  		count++;
		    	  		break loop;}
		      }
		}
		sum+=y.length()-count;
		System.out.println(sum);
		sc.close();
	}
}
