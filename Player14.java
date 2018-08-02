import java.io.*;
import java.io.IOException;
import java.lang.*;
import java.util.Scanner;
public class Player14
{
 public static void main(String[] args) throws IOException
 {
   Scanner sc=new Scanner(System.in);
   BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
   String len=is.readLine();
   int m=Integer.parseInt(len);
   String str=sc.nextLine();
   if(str.length()>m||str.length()<m)
	   System.exit(0);
   String vow="aeiouAEIOU";
   StringBuilder sb=new StringBuilder(str);
   for(int i=0;i<str.length();i++)
    { 
          sb=new StringBuilder(str);
         if(vow.contains(""+str.charAt(i)))
           str=sb.delete(i,i+1).toString();
     }
   System.out.println(sb.reverse().toString());
 }
}
