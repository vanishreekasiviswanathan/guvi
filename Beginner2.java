import java.lang.*;
import java.util.Scanner;
public class Beginner2{
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n<0)
  System.out.println("invalid");
  else
    System.out.println((n%2==0)?"Even":"Odd");
}
}
