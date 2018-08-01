import java.lang.*;
import java.util.*;
public class Hunter10{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 HashSet<Integer> hs=new HashSet<Integer>();
 int m=sc.nextInt();
 int n=sc.nextInt();
 int[] a=new int[m];
 int[] b=new int[n];
 for(int i=0;i<m;i++)
   a[i]=sc.nextInt();
for(int i=0;i<n;i++)
  b[i]=sc.nextInt();
if(m>=n){
  for(int i=0;i<n;i++){
      for(int j=0;j<m;j++)
           if(b[i]==a[j])
               hs.add(j);
               }
 }
if(hs.size()==n)
   System.out.println("YES");
  if(hs.size()<n || m<n)
    System.out.println("NO");
}
}
