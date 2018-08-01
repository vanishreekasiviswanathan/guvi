import java.lang.*;
import java.util.Scanner;
public class Pro7{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int count=0;
  boolean flag=false;
  for(int i=2;(flag==false);i++)
  {
    if(Math.pow(2,i)==n){
            count=0;
            break;
         }
       int k=(int)Math.pow(2,i);
       if(n<k)
            {
    	      count=n-(int)Math.pow(2,i-1);
    	       if(count>(k-n))
            	  count=k-n;
               break;
            }
  }
  System.out.println(count);
}
}
