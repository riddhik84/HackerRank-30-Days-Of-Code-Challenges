package com.hackerrank.my.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Nod_e{
	Nod_e left,right;
	int data;
	Nod_e(int data){
		this.data=data;
		left=right=null;
	}
} 

public class Day23 {

	static void levelOrder(Nod_e root){
		//Write your code here
		Queue<Nod_e> queue = new LinkedList<Nod_e>();
		queue.add(root);

		while(!queue.isEmpty()){
			Nod_e current = queue.remove();
			System.out.print(current.data + " ");
			if (current.left!=null) queue.add(current.left);
			if (current.right!=null) queue.add(current.right);
		}
	}

	public static Nod_e insert(Nod_e root,int data){
		if(root==null){
			return new Nod_e(data);
		}
		else{
			Nod_e cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Nod_e root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		levelOrder(root);
	}	
}
