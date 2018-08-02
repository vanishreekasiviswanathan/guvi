import java.lang.*;
import java.util.Scanner;
public class Beginner13
{
public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean flag=false;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0)
      {
          flag=true;
          break;
      }
    }
    if(flag)
       System.out.println("yes");
       else
         System.out.println("no");
  }
}
