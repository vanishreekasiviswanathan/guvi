import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int k=sc.nextInt();
		int len=(""+n).length()-k;
		ArrayList<String> l=new ArrayList<String>();
		if(len==0) {
			System.out.println("0");System.exit(0);}
		else if(len>0) {
			for(int p=0,i=0;p<=m.length()-len;p++,i++) {
				l.add(m.substring(i,i+len));
			}
			Collections.sort(l);
			System.out.println(l.get(0));
		}
	}
}
