import java.lang.*;
import java.util.Scanner;
public class Player7
{
public static void main(String[] args)
{
  Scanner s=new Scanner(System.in);
  String str=s.next();
  String res="";
  for(int i=0;i<str.length()-1;i+=2)
  {
  StringBuilder sb=new StringBuilder(str.substring(i,i+2));
  res+=sb.reverse();
  }
  if(str.length()%2==1)
    res+=str.charAt(str.length()-1);
  System.out.println(res);
}
}
