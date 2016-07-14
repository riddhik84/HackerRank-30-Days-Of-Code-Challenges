/**
 * @author Riddhi Kakadia
 */

package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day5 {
	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        
	        for(int i = 1; i <=10; i++){
	        	int mul = i * N;
	        	System.out.println(N + " x " + i + " = " + mul);
	        }
	        in.close();
	}
}
