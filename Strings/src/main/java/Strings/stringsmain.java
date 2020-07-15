package Strings;
import java.util.*;

public class stringsmain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Strings");
		int n=scan.nextInt();
		List<String> s=new ArrayList<String>();
		System.out.println("Enter "+n+" strings");
		for(int i=0;i<n;i++) {
			s.add(scan.next());
		}
		List<String> result=stringfilter.findstrings(s);
		System.out.print("Strings starts with s and has length of 3 are :  ");
		for(int i=0;i<result.size()-1;i++) {
			System.out.print(result.get(i)+" , ");
			
		}
		int i=result.size()-1;
		System.out.println(result.get(i));
		scan.close();
		
		
	}

}
