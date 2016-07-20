package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day29 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for(int a0 = 0; a0 < t; a0++){
			int maxValue = 0;
			int sum = 0;

			int n = in.nextInt();
			int k = in.nextInt();

			int s[] = new int[n];
			for(int x = 1; x <= s.length; x++){
				s[x-1] = x;
			}

			for(int xx = 1; xx <= k; xx++ ){
				for(int yy = 0; yy < s.length; yy++){
					int a = xx;
					int b = s[yy];
					if(a < b){
						sum = a & b;
						if(sum < k){
							//System.out.println("Sum: " + sum + "k:" +k + "maxValue:" + maxValue);
							if(sum > maxValue){
								maxValue = sum;
							}
						}
					}
				}
			}

			System.out.println("" + maxValue);
		}
	}
}
