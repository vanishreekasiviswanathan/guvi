import java.lang.*;
import java.util.Scanner;
public class Hunter11
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] ar=str.split(" ");
str="";
for(int i=0;i<ar.length;i++)
{
    StringBuffer sb=new StringBuffer(ar[i]);
    ar[i]=sb.reverse().toString();
   System.out.print(ar[i]+" ");
}
}
}
