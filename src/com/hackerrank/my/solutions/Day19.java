package com.hackerrank.my.solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculato_r(); 
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
		System.out.println(sum);
	}
}

interface AdvancedArithmetic{
	int divisorSum(int n);
}

class Calculato_r implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int divsum = 0;
		ArrayList<Integer> divisors = new ArrayList<>();
		
		for(int i = 1; i <= n; i++){
			int val = n % i;
			//System.out.println("n:" + n + " i:" + i + " " + val);
			if(val == 0){
				//System.out.println("add: " + i);
				divisors.add(i);
			}
		}
		
		for(int x = 0; x < divisors.size(); x++){
			divsum = divsum + divisors.get(x);
		}
		
		return divsum;
	}
}


