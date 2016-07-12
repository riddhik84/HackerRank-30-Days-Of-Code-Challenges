package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day16 {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String S = in.next();
	        
	        try{
	        	int value = Integer.parseInt(S);
	        	System.out.println(value);
	        }catch (NumberFormatException nfe){
	        	System.out.println("Bad String");
	        }
	    }
}
