import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
public class Hunter12{
public static void main(String[] ar)
{
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int count=sc.nextInt();
  int[] ar1=new int[n];
  for(int i=0;i<n;i++)
    ar1[i]=sc.nextInt();
  Arrays.sort(ar1);
  for(int i=n-1,k=0;i>=0;i--)
    {
	  k++;
      if(k==count)
        System.out.println(ar1[i]);
    }
}
}
