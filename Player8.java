import java.lang.*;
import java.util.Scanner;
public class Player8{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  String[] s=str.split(" ");
  String res="";
  for(int i=0;i<s.length;i++)
  {
   char[] ch=s[i].toCharArray();
   for(int j=0;j<ch.length;j++)
     {
     if(j==0)
       res+=(""+ch[j]).toUpperCase();
      else
         res+=(""+ch[j]).toLowerCase();
     }
     if(s.length>1)
     res+=" ";
  }
  System.out.println(res);
}
}
