import java.lang.*;
import java.util.Scanner;
public class Beginner3{
public static void main(String[] arg)
{
  Scanner sc=new Scanner(System.in);
  char ch=sc.next().charAt(0);
  ch=Character.toUpperCase(ch);
  if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      System.out.println("Vowel");
  else if(ch>'A' && ch<'Z')
      System.out.println("Consonant");
     else
       System.out.println("invalid");
}
}
