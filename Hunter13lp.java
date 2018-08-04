import java.lang.*;
import java.util.LinkedList;
import java.util.Scanner;
public class Hunter13lp{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  char[] ch=str.toCharArray();
  LinkedList<Character> ll=new LinkedList<Character>();
  for(Character c:ch)
    ll.add(c);
 for(int j=str.length()-1,i=0;j>=0;j--)
   ch[i++]=str.charAt(j);
   int k=0;
   int count=0;
  for(Character m:ll)
  {
    if(m==ch[k++])
      count++;
  }
  if(count==ch.length)
    System.out.println("yes");
    else
      System.out.println("no");
 }
}
