package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}


class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] values){
		elements = values;
	}

	void computeDifference(){
		int tmpDiff = 0;
		int j = 0;
		for(int i = 0; i < elements.length; i++){
			j = i;
			while(j < elements.length - 1){
				tmpDiff = elements[i] - elements[j+1];
				//System.out.println("tmpDiff: " + elements[i] + "-" + elements[j+1] + " " +tmpDiff);

				tmpDiff = Math.abs(tmpDiff);
				if(tmpDiff > maximumDifference){
					maximumDifference = tmpDiff;
				}
				j++;
			}
		}
	}
}
