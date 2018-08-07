import java.lang.*;
import java.util.Scanner;
public class Player17
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int l=sc.nextInt();
  int r=sc.nextInt();
  boolean flag=false;
  for(int i=1;flag==false;i++)
  {
    if(i%l==0 && i%r==0){
    System.out.println(i);
        flag=true;
        }
  }
  sc.close();
}
}
