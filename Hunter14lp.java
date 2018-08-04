import java.lang.*;
import java.util.HashSet;
import java.util.Scanner;
public class Hunter14lp
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 HashSet<String> hs=new HashSet<String>();
  String str=sc.next();
  char[] ch=str.toCharArray();
  for(int i=0;i<ch.length;i++)
     for(int j=0;j<ch.length-1;j++)
       {
        char c=ch[j];
         ch[j]=ch[j+1];
          ch[j+1]=c;
           String s="";
         for(int k=0;k<ch.length;k++)
            s+=ch[k];
          hs.add(s);
        }
  for(String sm:hs)
     System.out.println(sm);
}
}
