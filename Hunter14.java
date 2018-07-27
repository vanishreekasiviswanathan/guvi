import java.lang.*;
import java.util.Scanner;
import java.util.HashSet;
public class Hunter14{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String s=""+n;
HashSet<String> hs=new HashSet<String>();
for(int i=0;i<s.length();i++){
   String str+=s.charAt(i);
  for(int j=0;j<s.length();j++){
     if(i!=j)
      str+=s.charAt(j);
  }
  hs.add(str);
}
for(String sm:hs)
System.out.println(sm);
}
}
