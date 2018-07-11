import java.lang.*;
import java.util.Scanner;
public class Beginner1
{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
if(N>0)
  System.out.println("positive");
  else
    System.out.println(N<0?"negative":"zero");
}
}
