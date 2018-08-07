import java.lang.*;
import java.util.Scanner;
public class Player{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  String res="";
  for(int i=0;i<str.length();i++)
  {
  char c=str.charAt(i);
  if(c==120 ||(c==88)   
        res+='a';
     else if(c==121||c==89)
        res+='b';
       else if(c==122||c==90)
        res+='c';
        else if((c>=65&&c<=90)||(c>=97 && c<=122))
          res+=(char)(c+3);
          else
            res+=c;
    }
    System.out.println(res);
}
}
