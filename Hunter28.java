import java.lang.*;
import java.util.Scanner;
import java.util.HashSet;
public class Hunter28
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  HashSet<Character> hs=new HashSet<Character>();
  String str=sc.nextLine();
   for(int i=0;i<str.length();i++)
   {
      hs.add(str.charAt(i));
   }
   for(Character ch:hs)
     System.out.print(ch);
}
}
