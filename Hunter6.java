import java.lang.*;
import java.util.Scanner;
public class Hunter6{
public static void main(String[] arg){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] ar=new int[n];
for(int i=0;i<n;i++)
  ar[i]=s.nextInt();
 for(int i=0;i<n;i++){
 if(i%2==0){
    if(ar[i]%2==0)
        System.out.print(ar[i]+" ");
        }
    else{
      if(ar[i]%2!=0)
       System.out.print(ar[i]+" ");
       }
 }
}
}
