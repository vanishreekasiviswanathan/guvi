import java.lang.*;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
public class Hunter13
{
public static void main(String[] ar)
{
  Scanner sc=new Scanner(System.in);
  HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
  int n=sc.nextInt();
  int[] arr=new int[n];
  int k=sc.nextInt();
  for(int i=0;i<n;i++)
  {
    arr[i]=sc.nextInt();
    if(arr[i]!=k) 
    hm.put(arr[i],k-arr[i]);
  }
  k=0;
loop:  for(Map.Entry<Integer,Integer> m:hm.entrySet()) {
         System.out.print(m.getKey()+" ");
          k+=1;
        if(k==3)
    	   break loop;
        }
}
}
