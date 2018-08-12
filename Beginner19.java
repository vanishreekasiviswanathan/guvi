import java.lang.*;
import java.util.Scanner;
public class Beginner19
{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int fact=1;
  for(int i=n;i>0;i--)
    fact*=i;
  System.out.println(fact);
 }
}
