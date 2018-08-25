import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class Pro40{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s="dhoni";
		boolean flag=false;
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		char[] c=s.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(c);
		if(s.length()==str.length())
		{
			for(int i=0;i<s.length();i++)
		       if(ch[i]!=c[i])
		    	   flag=true;
		}
		System.out.println((flag)?"no":"yes");
		sc.close();
	}
}
