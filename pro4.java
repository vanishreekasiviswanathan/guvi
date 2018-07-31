import java.lang.*;
import java.util.Scanner;
public class pro4{
public static void main(String[] arg)
{
   Scanner sc=new Scanner(System.in);
   int sum=0;
   String str1=sc.next().toUpperCase();
   String str2=sc.next().toUpperCase();
   int i=0;
   if(str1.length()>str2.length()){
      for(i=0;i<str2.length();i++){
         sum+=Math.abs(str1.charAt(i)-str2.charAt(i));
       }
       for(int j=i;j<str1.length();j++)
         sum+=Math.abs(str1.charAt(j)-64);
   }
   else{
      for(i=0;i<str1.length();i++){
    	  sum+=Math.abs(str1.charAt(i)-str2.charAt(i));
       }
       for(int j=i;j<str2.length();j++)
         sum+=Math.abs(str2.charAt(j)-64);
   }
   System.out.println(sum);
   sc.close();
}
}
