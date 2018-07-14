import java.lang.*;
import java.util.Scanner;
public class Player1{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
String str=sc.next();
if(str.length()>0)
  for(int i=str.length()-1;i>=0;i--)
    System.out.print(str.charAt(i));
else
	System.out.println(str);
}
}
