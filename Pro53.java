import java.lang.*;
import java.util.Scanner;
import java.util.HashSet;
public class Pro53
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 HashSet<Character> hs=new HashSet<Character>();
 String s=sc.nextLine();
 s=s.replaceAll(" ","");
 s=s.toUpperCase();
 char[] ch=s.toCharArray();
 for(int i=0;i<ch.length;i++)
 {
  if(ch[i]>='A' && ch[i]<='Z')
    hs.add(ch[i]);
 }
 System.out.println((hs.size()==26)?"YES":"NO");
 sc.close();
}
}
