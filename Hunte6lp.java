import java.lang.*;
import java.util.Scanner;
public class Hunter6lp
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  HashSet<Integer> hs=new HashSet<Integer>();
  int n=sc.nextInt();
  int[] ar=new int[n];
  int count=0;
  for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
  for(int i=0;i<n;i++)
  {
     count++;
     hs.add(ar[i]);
     if(count>hs.size())
     {
        System.out.println(ar[i]);
        break;
     }
  }
}
}
