import java.lang.*;
import java.util.Scanner;
public class Player14
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   String vow="aeiouAEIOU";
   StringBuilder sb=null;
   for(int i=0;i<str.length();i++)
    { 
       sb=new StringBuilder(str);
         if(vow.contains(""+str.charAt(i)))
           str=sb.delete(i,i+1).toString();
     }
   System.out.println(sb.reverse().toString());
 }
}
