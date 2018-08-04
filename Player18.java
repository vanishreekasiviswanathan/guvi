import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class Player18
{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String[] str=new String[n];
   for(int i=0;i<n;i++)
	   str[i]=sc.next();
   int count=0;
   String m="aabikl";
   for(int i=0;i<n;i++) {
	   char[] ch=str[i].toCharArray();
	   Arrays.sort(ch);
	   int counter=0;
	   for(int j=0;j<ch.length;j++)
          if((""+ch[j]).contains(""+m.charAt(j)))
              counter++;
	   if(counter==m.length())
		   count++;
   }
   System.out.println(count);
}
}
