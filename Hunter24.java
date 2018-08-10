import java.lang.*;
import java.util.Scanner;
public class Hunter24
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int[] ar=new int[n];
  for(int i=0;i<n;i++)
     ar[i]=sc.nextInt();
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
       if(i!=j && (ar[i]+ar[j]==k))
        {
            flag=true;
            break;
        }
  }
  System.out.println((flag)?"yes":"no");
}
}
