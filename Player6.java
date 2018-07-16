import java.lang.*;
import java.util.HashMap;
import java.util.Scanner;
public class Player5{
	public static String checkIsomorphic(String s1, String s2) {
	    if(s1==null||s2==null)
	        return "no";
	    if(s1.length()!=s2.length())
	        return "no";
	    HashMap<Character, Character> iso = new HashMap<Character, Character>();
	    for(int i=0; i<s1.length(); i++){
	        char c1 = s1.charAt(i);
	        char c2 = s2.charAt(i);
	        if(iso.containsKey(c1)){
	            if(iso.get(c1)!=c2)
	                return "no";
	        }else{
	            if(iso.containsValue(c2)) 
	                return "no";
	            iso.put(c1, c2);
	        }
	    }
	    return "yes";
	}
public static void main(String[] arg){
  System.out.println(checkIsomorphic("aa","xy"));
}
}
