import java.lang.*;
import java.util.Scanner;
public class Player10
{
public static void main(String[] arg)
{
  Scanner sc=new Scanner(System.in);
  String s1=sc.next();
String s2=sc.next();
int count=0;
  if(s1.length()>s2.length() || s2.length()>s1.length())
  {
	  System.out.println("no");
  }
  else if(s1.length()==s2.length())
  {
	  for(int i=0;i<s1.length();i++)
	  {
		  if(s1.charAt(i)==s2.charAt(i))
			  count++;
	  }
	  if(count==s1.length()-1)
		  System.out.println("yes");
	  else
		  System.out.println("no");
  }
}
}

