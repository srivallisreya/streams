package palindrome;

import java.util.List;
import java.util.stream.Collectors;

public class palindromefilter {
	
	public static List<String> findpalindrome(List<String> s) {
		
		List<String >res=s.stream().filter((str)->str.contentEquals(reverseString(str))).collect(Collectors.toList());
		return res;
	}
	private static String reverseString(String str) {
		str=str.toLowerCase();
		if(str.isEmpty()){
	         return str;
	      }else{
	         return reverseString(str.substring(1))+str.charAt(0);
	      }
	}

}
