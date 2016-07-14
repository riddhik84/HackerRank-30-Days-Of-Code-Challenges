package com.hackerrank.my.solutions;

public class Day21 {
	public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Day21.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
	
	//Generics <E>
	static <E> void printArray(E[] inputArray){
		for (E element : inputArray){
			System.out.println(element);
		}
	}

}
