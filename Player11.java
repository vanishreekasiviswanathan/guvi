import java.lang.*;
import java.util.Scanner;
public class Player11
{
  public static void main(String[] ar)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    if(str.equalsIgnoreCase("Saturday") || str.equalsIgnoreCase("Sunday"))
      System.out.println("yes");
     else
      System.out.println("no");
  }
}
