package com.hackerrank.my.solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        ArrayList<Integer> hourGlassSum = new ArrayList<>();
        int sum = 0;
        for(int i = 0, j = 0; j < 6 ; i++,j++){
        	sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
        }
             
      }
}
