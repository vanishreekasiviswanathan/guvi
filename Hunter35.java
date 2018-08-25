import java.lang.*;
import java.util.Scanner;
import java.util.HashSet;
public class Hunter35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ch=str.toCharArray();
		boolean flag=false;
		for(int i=0;i<ch.length;i++)
		{
			double len=ch.length-1;
			HashSet<Character> hs=new HashSet<Character>();
			for(int j=0;j<ch.length;j++)
			{
				if(i!=j)
				  hs.add(ch[j]);
			}
			if(len== 2*hs.size()) {
				flag=true;
				break;
			}
		}
		System.out.println((flag)?"YES":"NO");
		sc.close();
	}
}
