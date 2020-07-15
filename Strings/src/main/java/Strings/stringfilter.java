package Strings;
import java.util.*;
import java.util.stream.*;

public class stringfilter {
	public static List<String> findstrings(List<String> s) {
		List<String >res=s.stream().filter((str)->str.length()==3 && str.startsWith("a")).collect(Collectors.toList());
		return res;

	}

}
