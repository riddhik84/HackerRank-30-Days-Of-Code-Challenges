/**
 * @author Riddhi Kakadia
 */

package com.hackerrank.my.solutions;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName 
				+ 	"\nID: " + idNumber); 
	}

}

class Student extends Person {
	private int[] testScores;

	Student(String fname, String lname, int id, int[] scores){
		super(fname, lname, id);
		testScores = scores;
	}
	
	String calculate(){
		int sum = 0;
		String grade = "";
		for(int i = 0; i < testScores.length; i++){
			sum = sum + testScores[i];
		}
		int avrg = sum / testScores.length;
		
		if(90 <= avrg &&  avrg <= 100){
			grade = "O";
		} else if (80 <= avrg &&  avrg <= 90){
			grade = "E";
		} else if (70 <= avrg &&  avrg <= 80){
			grade = "A";
		} else if (55 <= avrg &&  avrg <= 70){
			grade = "P";
		} else if (40 <= avrg &&  avrg <= 55){
			grade = "D";
		} else if( avrg < 40){
			grade = "T";
		}
		return grade;
	}
}


class Day12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
