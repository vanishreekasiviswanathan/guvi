import java.lang.*;
import java.util.Scanner;
public class Player2{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long sum=1;
for(int i=1;i<=n;i++)
  sum=sum*i;
  System.out.println(sum);
}
}
