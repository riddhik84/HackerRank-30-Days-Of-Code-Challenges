package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day1 {

	public static void main(String... args){
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		int ii = 0;
		double dd = 0.0;
		String ss = null;

		ii = scan.nextInt();
		dd = scan.nextDouble();
		ss = scan.next();
		ss = ss + scan.nextLine(); //Need to scan one more time to get full line as input

		System.out.println(i + ii);
		System.out.println(d + dd);
		System.out.println(s + ss);
		
		scan.close();
	}
}
