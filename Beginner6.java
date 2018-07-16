import java.lang.*;
import java.util.Scanner;
public class Beginner6{
public static void main(String[] arg){
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if(year%4==0)
  System.out.println("yes");
  else
      System.out.println("no");
}
}
