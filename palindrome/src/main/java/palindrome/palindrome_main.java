package palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class palindrome_main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Strings");
		int n=scan.nextInt();
		List<String> s=new ArrayList<String>();
		System.out.println("Enter "+n+" strings");
		for(int i=0;i<n;i++) {
			s.add(scan.next());
		}
		List<String> result=palindromefilter.findpalindrome(s);
		System.out.print("Strings starts with s and has length of 3 are :  ");
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i)+"  ");
			
		}
		
		scan.close();
		
		
	}

}
