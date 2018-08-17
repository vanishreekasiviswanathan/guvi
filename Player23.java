import java.lang.*;
import java.util.*;
public class Player23
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   PriorityQueue<Integer> a=new PriorityQueue<Integer>();
   PriorityQueue<Integer> b=new PriorityQueue<Integer>();
   for(int i=0;i<n;i++)
      a.add(sc.nextInt());
   for(int i=0;i<k;i++)
      b.add(sc.nextInt());
   for(Integer m:b)
   {
      a.add(m);
      System.out.print(Collections.max(a)+" ");
   }
   sc.close();
 }
}
