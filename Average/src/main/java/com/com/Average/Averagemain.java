package com.com.Average;
import java.util.*;

public class Averagemain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Integers");
		int n=scan.nextInt();
		int[] l=new int[n];
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++) {
			l[i]=scan.nextInt();
		}
		
		System.out.println("Average of the values is: "+Averagenum.findAverage(l));
		scan.close();
	}

}
