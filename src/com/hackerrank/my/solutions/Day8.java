package com.hackerrank.my.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> dictionary = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dictionary.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dictionary.containsKey(s)){
            	System.out.println(s + "=" + dictionary.get(s));
            }else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
