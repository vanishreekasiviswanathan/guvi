import java.lang.*;
import java.util.Scanner;
public class Hunter13
{
public static void main(String[] arg)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int sum=0;
  String str=""+n;
  for(int i=0;i<str.length();i++)
  {
  int m=Character.getNumericValue(str.charAt(i));
  System.out.println(m);
  sum+=Math.pow(m,2);
  }
  System.out.println(sum);
  }
  }
