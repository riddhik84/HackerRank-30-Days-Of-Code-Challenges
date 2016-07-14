/**
 * @author Riddhi Kakadia
 */

package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String str = "";

		//If remainder is 1, the number is Odd
		if(n%2 == 1){
			//Odd
			str = "Weird";
		}else{
			//Even
			if(n>=2 && n<=5){
				str = "Not Weird";
			} else if (n>=6 && n<=20){
				str = "Weird";
			} else if(n > 20) {
				str = "Not Weird";
			}
		}

		System.out.println(str);
	}

}
