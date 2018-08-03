import java.lang.*;
import java.util.Scanner;
public class  Player15
{
  public static void main(String[] arg)
  {
    Scanner sc=new Scanner(System.in);
    int count=0;
    char c='\u0000';
    String str=sc.nextLine();
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
      int temp=0;
      for(int j=0;j<ch.length;j++)
      {
        if(ch[i]==ch[j])
           temp++;
      }
      if(count<temp){
          count=temp;
          c=ch[i];
      }
    }
    System.out.println(c);
  }
}
