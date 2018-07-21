import java.lang.*;
import java.util.Scanner;
public class Hunter8{
public static void main(String[] arg){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] ar=new int[n];
  for(int i=0;i<n;i++)
  {
  ar[i]=sc.nextInt();
  }
  for(int i=0;i<=n-3;i++)
   {
   System.out.println(ar[i]+" "+ar[i+1]+" "+ar[i+2]);
   }
}
}
