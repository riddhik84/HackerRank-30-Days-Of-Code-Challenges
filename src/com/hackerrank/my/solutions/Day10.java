/**
 * @author Riddhi Kakadia
 */


package com.hackerrank.my.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day10 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String binary = Integer.toBinaryString(n);
		System.out.println(binary);
		char[] binValues = binary.toCharArray();
		ArrayList<Integer> max = new ArrayList<>();
		int counter = 1;
		for(int k = 1; k < binValues.length; k++){
			int last = Character.getNumericValue(binValues[k-1]);
			int current = Character.getNumericValue(binValues[k]);
			if((last == 1)&& (current == 1)){
				counter++;
				max.add(counter);
			} else {
				max.add(counter);
				counter = 1;
			}
		}
		
		Collections.sort(max);
		if(max.size() > 1){
			System.out.println(max.get(max.size() -1));
		} else {
			System.out.println(max.get(0));
		}
	}
}
