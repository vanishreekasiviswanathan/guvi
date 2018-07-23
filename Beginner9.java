import java.lang.*;
import java.util.Scanner;
public class GetPropertiesDemo
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int k=sc.nextInt();
  int[] ar=new int[n];
  for(int i=0;i<n;i++)
    ar[i]=sc.nextInt();
    int sum=0;
  for(int i=0;k>0;i++) {
    sum+=ar[i];
    k--;
  }
  System.out.println(sum);
  }
}
