import java.lang.*;
import java.util.Scanner;
public class Beginner16{
public static void main()
{
   Scanner sc=new Scanner();
   int x=sc.nextInt();
   int y=sc.nextInt();
   for(int i=x+1;i<y;i++){
   boolean p=false;
 loop: for(int j=2;j<Math.sqrt(i);j++)
   {
    if(i%j==0)
    {
       p=true;
       break loop;
    }
   }
   if(!p)
     System.out.print(i+" ");
   }
}
}
