import java.lang.*;
import java.util.Scanner;
public class Player21
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
 int[] a=new int[2];
 int[] b=new int[2];
 int[] c=new int[2];
 a[0]=sc.nextInt();
 a[1]=sc.nextInt();
 b[0]=sc.nextInt();
 b[1]=sc.nextInt();
 c[0]=sc.nextInt();
 c[1]=sc.nextInt();
 boolean flag=false;
 for(int i=0;i<2;i++){
      if(a[i]==b[i] &&b[i]==c[i])
       {
        flag=true;break;
        }
   }
   System.out.println((flag)?"yes":"no");
 sc.close();
}
}
