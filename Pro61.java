import java.lang.*;
import java.util.Scanner;
public class Pro61{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String st=sc.next();
		String res="";
		if(str.length()==st.length())
		for(int i=0;i<str.length();i++)
		{
			int x=str.charAt(i)-96;
			int y=st.charAt(i)-96;
			if((x+y)>=26)
				res+='z';
			else
				res+=((char)(x+y+96));
		}
		System.out.println(res);
		sc.close();
	}
}
