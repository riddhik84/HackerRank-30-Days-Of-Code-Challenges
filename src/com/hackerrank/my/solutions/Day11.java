/**
 * @author Riddhi Kakadia
 */

package com.hackerrank.my.solutions;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Solution referenced from discussion help topics
 */

public class Day11 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for(int i=0; i < 6; i++){
			for(int j=0; j < 6; j++){
				arr[i][j] = in.nextInt();
			}
		}
		int hourGlassSum[] = new int[16];
		int hourGlass = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				hourGlassSum[hourGlass] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
						+ arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
								+ arr[i+2][j+2];
				hourGlass++;
			}
		}
		Arrays.sort(hourGlassSum);
		System.out.println(hourGlassSum[15]);
	}
}
