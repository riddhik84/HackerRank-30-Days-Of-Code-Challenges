package com.hackerrank.my.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day28 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> names = new ArrayList<>();

		for(int a0 = 0; a0 < N; a0++){
			String firstName = in.next();
			String emailID = in.next();

			if(emailID.contains("@gmail.com")){
				names.add(firstName);
			}
		}
		Collections.sort(names);
		for(String name : names){
			System.out.println(name);
		}
	}

}
