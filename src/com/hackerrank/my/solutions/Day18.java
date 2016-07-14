/**
 * @author Riddhi Kakadia
 */

package com.hackerrank.my.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day18 {
	
	Stack stack = new Stack();
	Queue queue = new LinkedList<>();
	
	void pushCharacter(char c){
		stack.push(c);
	}
	
	void enqueueCharacter(char c){
		queue.add(c);
	}
	
	char popCharacter(){
		char c = (char) stack.pop();
		return c;
	}
	
	char dequeueCharacter(){
		char c = (char) queue.remove();
		return c;
	}
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}
