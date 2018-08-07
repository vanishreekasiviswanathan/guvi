import java.lang.*;
import java.util.Scanner;
public class Player19
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String str="";
  for(int i=1;i<=n;i++)
  {
     while(n%i==0)
     {
       if(!str.contains(""+i))
         str+=i;
         n/=i;
     }
  }
  if(n<1)
     System.out.println(n);
   for(int i=0;i<str.length();i++)
      System.out.print(str.charAt(i)+" ");
}
}
