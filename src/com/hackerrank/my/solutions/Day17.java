/**
 * @author Riddhi Kakadia
 */


package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day17 {

	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		while(T-->0)
		{
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try
			{
				int ans=myCalculator.power(n,p);
				System.out.println(ans);

			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}
}

class Calculator {

	int power(int n, int p){
		int pow = 0;
		if(n < 0 || p < 0){
			throw new IllegalArgumentException("n and p should be non-negative");
		} else {
			pow = (int) Math.pow(n, p);
		}
		return pow;
	}
}
