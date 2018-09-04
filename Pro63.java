import java.lang.*;
import java.util.Scanner;
import java.util.HashSet;
public class Pro63
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  HashSet<String> hs=new HashSet<String>();
  String str=sc.nextLine();
  int len=str.length()-1;
  int max=0;
  int p=1;
  for(int i=0;i<str.length();i++)
  {
    for(int m=i;m<str.length();m++){
    for(int j=i;j<=len;j++)
    {
      String s=str.substring(j,j+p);
      HashSet<Character> h=new HashSet<Character>();
      for(int k=0;k<s.length();k++)
          h.add(s.charAt(k));
      if(s.length()==h.size())
         hs.add(s);
    }p++;len-=p;}
    }
    for(String s:hs)
    {
     max=Math.max(s.length(),max);
    }
    System.out.println(max);
}
}
