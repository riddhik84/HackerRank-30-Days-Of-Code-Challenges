package com.hackerrank.my.solutions;

import java.util.Scanner;

public class Day15 {
	//static LinkedList<Node> linkedList = new LinkedList<>();

	public static  Node insert(Node head, int data) {
		//Complete this method
		if(head == null){
			return new Node(data);
		} else if( head.next == null){
			head.next = new Node(data);
		} else {
			insert (head.next, data);
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt(); //4

		while(N-- > 0) { //4-- 2
			int ele = sc.nextInt(); //2
			head = insert(head,  ele);
		}
		display(head);
		sc.close();
	}

}

class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}
