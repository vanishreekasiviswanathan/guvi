import java.lang.*;
import java.util.Scanner;
public class Hunter3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int len=sc.nextInt();
boolean flag=false;
int[] num=new int[len];
for(int i=0;i<len;i++)
   num[i]=sc.nextInt();
for(int i=0;i<len;i++)
  if(i==num[i])
    {
       flag=true;
       System.out.print(num[i]+" ");
    }
    if(!flag)
    System.out.println("-1");
}
}

