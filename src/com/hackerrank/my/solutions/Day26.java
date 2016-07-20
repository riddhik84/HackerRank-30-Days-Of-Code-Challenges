package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day26 {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int date_actual = sc.nextInt();
		int month_actual = sc.nextInt();
		int year_actual = sc.nextInt();

		int date_expected = sc.nextInt();
		int month_expected = sc.nextInt();
		int year_expected = sc.nextInt();

		int fine = 0;

		System.out.println(date_actual + " " + date_expected + " " + month_actual + " " + month_expected + " " +
				year_actual + " " + year_expected);

		if(year_actual > year_expected){
			fine = 10000;
		} else if (year_actual < year_expected) {
			fine = 0;
		} else if (month_actual > month_expected){
			int diff = month_actual - month_expected;
			//System.out.println("month " + diff);
			fine = diff * 500;
		} else if (date_actual > date_expected){
			int diff = date_actual - date_expected;
			//System.out.println("date " + diff);
			fine = diff * 15;
		} else {
			fine = 0;
		}

		System.out.println(fine);
	}

}
