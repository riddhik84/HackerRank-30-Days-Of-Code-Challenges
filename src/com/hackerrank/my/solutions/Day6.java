package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day6 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int lineCnt = sc.nextInt();
		
		for(int i = 0; i < lineCnt; i++){
			String value = sc.next();
			
			char[] charArray = value.toCharArray();
			String odd = "";
			String even = "";
			for(int j = 0; j < charArray.length; j++ ){
				if(j%2 == 0){
					even += charArray[j] + "";
				} else {
					odd += charArray[j] + "";
				}
			}
			System.out.println(even.trim() + " " + odd.trim());
		}
		sc.close();
	}

}
