package org.practice.stack;

import java.util.Scanner;

class StackApp{
	private int [] data;
	private int top;
	
	public StackApp(int size) {
	
		this.data = new int[size];
		this.top = -1;
	}

	public void push(int val) {
		if(isFull())
			throw new RuntimeException(val+" is not added\nStack is OverFlow");
		else {
		top++;
		data[top] = val;
		}
		
	}

	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is UnderFlow");
		else
			top--;
	}

	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Stack is UnderFlow");
		return data[top];
	}

	public boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
		
	}

	public boolean isFull() {
		if(top == (data.length-1))
			return true;
		return false;
		
	}	
}
public class StackPractice {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the stack : ");
		int s = sc.nextInt();
		StackApp st = new StackApp(s);
		int choice,val;
			
			
		do {
			System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. isEmpty \n5. isFull\nEnter Choice ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					System.out.println("Enter Element: ");
					val = sc.nextInt();
					st.push(val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				//push
				break;
			case 2:
				try {
					val = st.peek();
					st.pop();
					System.out.println("Deleted Value : "+val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				try {
					System.out.println(st.peek()); 
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 4:
				if(st.isEmpty()== true)
					System.out.println("Stack is Empty");
				else
					System.out.println("Not Empty");
				//isEmpty
				break;
			case 5:
				if(st.isFull() == true)
					System.out.println("Stack is full");
				else
					System.out.println("Not full");
				//isFull
				break;
			}
		}while(choice != 0);
	}

}
