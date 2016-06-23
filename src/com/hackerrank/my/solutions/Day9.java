package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day9 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int fact = factorial(num);
		System.out.println(fact);
	}

	static int factorial(int num){
		if(num > 1){
			return num * factorial(num - 1);
		} else if(num <= 0){
			return 0;
		} else {
			return num;
		}
	}
}
