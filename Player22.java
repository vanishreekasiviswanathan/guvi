import java.lang.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Player22
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  ArrayList<Integer> al=new ArrayList<Integer>();
  int mini=Math.min(n,k);
  for(int i=1;i<=mini;i++)
  {
     if(n%i==0 && k%2==0)
         al.add(i);
  }
  System.out.println(a.get(al.size()-1));
}
}
