package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();
		
		//System.out.println("" + mealCost + " " + tipPercent + " " + taxPercent);
		
		// Write your calculation code here.
		double tip = mealCost * (tipPercent / 100.00); //Need to divide by 100.00 instead of 100 to get correct ans
		//System.out.println(tip);
		double tax = mealCost * (taxPercent / 100.00);
		//System.out.println(tax);
	      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost + tip + tax);
      
        // Print your result
		System.out.println("The total meal cost is "+totalCost+" dollars.");
	}
}
