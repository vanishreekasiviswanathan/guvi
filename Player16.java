import java.lang.*
import java.util.Scanner;
public class Player16{
public static void main(String[] arhs) {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] a=new int[n];
 for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
 for(int i=0;i<n;i++)
 {
   int count=0;
   for(int j=0;j<n;j++){
     if(a[i]==a[j])
       count++;
       }
   if(count==1)
     System.out.println(a[i]);
 }
  }
}
