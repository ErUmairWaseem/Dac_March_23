package org.practice.stack;

import java.util.Scanner;

class Stack{
	
	private int[] arr;
	private int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	public void push(int val) {
		if(isFull())
			throw new RuntimeException("Stack is full...");
		top++;
		arr[top] = val;
	}
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty...");
		top--;
	}
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is Empty...");
		return arr[top];
	}
	public boolean isEmpty() {
		
		if(top == -1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(top == (arr.length-1))
			return true;
		return false;
	}
}
public class StackMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Stack s = new Stack(6);
			int choice,val;
			do {
				System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. isEmpty\n5. isFull\n  Enter Choice");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					try {
						System.out.println("Enter value to push");
						val = sc.nextInt();
								
						s.push(val);
						} catch (Exception e) {
							System.out.println(e.getMessage());
					}
					break;
				case 2:
					try {
						val = s.peek();
						s.pop();
						System.out.println("Deleted Value :"+val);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					try {
						System.out.println("Top Most Value in stack : "+s.peek());
					} catch (Exception e) {
						System.out.println(e.getMessage());
					} 
					break;
				case 4:
					if(s.isEmpty() == true) 
						System.out.println("Stack is Empty");
					else
						System.out.println("Stack is not Empty");
					
					break;
				case 5:
					if(s.isFull()==true)
						System.out.println("Stack is Full");
					else
						System.out.println("Stack is not full");
					
					break;
				}
			}while(choice != 0);
		}
	}
}
