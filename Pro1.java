import java.lang.*;
import java.util.Scanner;
public class Pro1{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
 int in=sc.nextInt();
 String[] s=new String[in];
 int count=0;
 String minStr="",res="";
 s[0]=sc.next();
 int min=s[0].length();
 for(int i=1;i<in;i++)
 {
	 s[i]=sc.next();
	 min=Math.min(min,s[i].length());
	 if(s[i].length()==min)
		 minStr=s[i];
 }
 loop:for(int i=0;i<min;i++) {
	char ch=minStr.charAt(i); count=0;
	for(int j=0;j<in;j++) {
		if(s[j].charAt(i)==ch)
			count++;	
		else
			break loop;
	}
	if(count==in) 
		res+=ch;
 }
 res=(res.length()!=0)?res:"not found";
	 System.out.println(res);
}
}
