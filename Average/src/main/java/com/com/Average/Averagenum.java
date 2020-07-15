package com.com.Average;

import java.util.*;

public class Averagenum {
	public static double findAverage(int[] l) {
		double averagevalue=0;
		averagevalue=Arrays.stream(l).average().orElse(Double.NaN);
		return averagevalue;
		
	}

}
