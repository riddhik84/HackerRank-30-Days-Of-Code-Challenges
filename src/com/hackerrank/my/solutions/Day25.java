package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day25 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();

		for(int i = 0; i < total; i++){
			isPrime(sc.nextInt());
		}
	}

	static void isPrime(int num){
		boolean primeNum = false;

		if(num == 1){
			System.out.println("Not prime");
			return;
		}
		if(primeNum == false){
			for(int k = 2; k < num/2; k++){
				int mod = num % k;
				if(mod == 0){
					primeNum = true;
					break;
				}
			}
		}
		
		if(primeNum == true){
			System.out.println("Not prime");
		} else {
			System.out.println("Prime");
		}
	}
}
