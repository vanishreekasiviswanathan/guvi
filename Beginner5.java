import java.lang.*;
import java.util.Scanner;
public class Beginner5{
public static void main(String[] arg){
Scanner s=new Scanner(System.in);
int max=s.nextInt();
for(int i=0;i<2;i++){
  int n=s.nextInt();
  if(n>max)
    max=n;
  }
  System.out.println(max);
}
}
