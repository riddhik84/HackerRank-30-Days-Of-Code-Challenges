/**
 * @author Riddhi Kakadia
 */

package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day7 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int len = arr.length;
        for(int j = len - 1; j >= 0; j--){
        	System.out.print(arr[j] + " ");
        }
        in.close();
	}
}
