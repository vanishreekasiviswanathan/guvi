import java.lang.*;
import java.util.Scanner;
public class Hunter40
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
int len=(""+n).length();
String str=""+n;
int sum=0;
for(int i=0;i<len;i++)
{
  sum+=Character.getNumericValue(str.charAt(i));
}
StringBuilder sb=new StringBuilder(""+sum);
sb.reverse();
System.out.println((String.valueOf(sum).equals(sb.toString()))?"YES":"NO");
}
}
