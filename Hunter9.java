import java.lang.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Hunter3{
public static void main(String[] arg){
  Scanner sc=new Scanner(System.in);
  HashSet<Integer> hs=new HashSet<Integer>();
  int n=sc.nextInt();
  int[] ar=new int[n];
  for(int i=0;i<n;i++)
  {
  ar[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++)
   for(int j=i+1;j<n;j++)
  {
    if(ar[i]+ar[j]==0) {
      hs.add(i);
      hs.add(j);
    }
  }
  for(Integer i:hs) {
	  System.out.print(ar[i]+" ");
  }
}
}
