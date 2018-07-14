import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Pro2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		byte k=sc.nextByte();
		int len=(""+n).length()-k;
		ArrayList<String> l=new ArrayList<String>();
		if(k==0)
		      System.out.println("0");
		else if(k>0) {
			for(int i=0;i<=((""+n).length())-len;i++) {
				l.add(m.substring(i,i+len));
			}
			Collections.sort(l);
			System.out.println(l.get(0));
		}
	}
}
